package com.amicus.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationProvider;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedGrantedAuthoritiesUserDetailsService;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private LoggingAccessDeniedHandler accessDeniedHandler;
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public AuthenticationManager providerManager() {
		PreAuthenticatedAuthenticationProvider preAuthProvider = new PreAuthenticatedAuthenticationProvider();
		PreAuthenticatedGrantedAuthoritiesUserDetailsService preAuthUserDetailsService = new PreAuthenticatedGrantedAuthoritiesUserDetailsService();
		preAuthProvider.setPreAuthenticatedUserDetailsService(preAuthUserDetailsService);

		List<AuthenticationProvider> providers = new ArrayList<AuthenticationProvider>();
		providers.add(preAuthProvider);
		return new ProviderManager(providers);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/bootstrap/**", "/css/**", "/js/**", "/userJoin", "/forgot").permitAll()
			.antMatchers("/user/**").hasRole("USER")
			.anyRequest().authenticated()
			.and()
			.formLogin().loginPage("/login")
			.usernameParameter("email")
			.passwordParameter("password")
			.defaultSuccessUrl("/main.do", true)
			.permitAll()
			.and()
			.logout()
			.invalidateHttpSession(true).clearAuthentication(true)
			.logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/login?logout").permitAll()
			.and().exceptionHandling().accessDeniedHandler(accessDeniedHandler);
	}

	/*@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("lwh0102@naver.com").password("1234").roles("SUPER")
			.and()
			.withUser("lwh0102@naver.com").password("1234").roles("USER");
	}*/

}
