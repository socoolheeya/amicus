package com.amicus.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.amicus.util.interceptor.LoginInterceptor;

@Configuration
@ComponentScan({"com.amicus"})
public class MvcConfig implements WebMvcConfigurer {
	
	@Value("${resource.location}")
	private String location;
	
	@Autowired
	private LoginInterceptor loginInterceptor;
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/**").addResourceLocations(location);
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
        //registry.addInterceptor(loginInterceptor)
        //		.addPathPatterns("/")
         //       .addPathPatterns("/*")
          //      .excludePathPatterns("/admin/**/")
           //     .excludePathPatterns("/login")
        //		.excludePathPatterns("/logout");
    }
	

}
