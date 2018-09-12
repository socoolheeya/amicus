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
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationProvider;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedGrantedAuthoritiesUserDetailsService;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private LoggingAccessDeniedHandler accessDeniedHandler;
	
	@Autowired
	private CustomLoginSuccessHandler customLoginSuccessHandler;
	
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
		http.authorizeRequests()
			.antMatchers("/bootstrap/**", "/css/**", "/js/**", "/login", "/login-error", "/forgot").permitAll()	
			.antMatchers("/user/**").access("ROLE_USER")
			.antMatchers("/admin/**").access("ROLE_ADMIN")
			.antMatchers("/**").authenticated()
			
			.and()
			.formLogin()
			.loginPage("/login")
			.loginProcessingUrl("/loginProc")
			.failureUrl("/login?error")
			.successHandler(customLoginSuccessHandler)
			.defaultSuccessUrl("/main", true)
			.usernameParameter("email")
			.passwordParameter("password")
			
			.and()
			.logout()
			.deleteCookies("JSESSIONID")
			.invalidateHttpSession(true).clearAuthentication(true)
			.logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/")
		
			.and()
			.rememberMe().rememberMeParameter("remember-me").key("unique").tokenValiditySeconds(86400)
		
			.and()
			.exceptionHandling().accessDeniedHandler(accessDeniedHandler)
		
			.and()
			.sessionManagement()
			.sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
			.invalidSessionUrl("/login")
			.maximumSessions(1)
			.maxSessionsPreventsLogin(true)
			.expiredUrl("/login");
		
	}
}
