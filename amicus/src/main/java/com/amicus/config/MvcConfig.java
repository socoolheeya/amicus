package com.amicus.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.amicus.util.interceptor.HttpInterceptor;

@Configuration
@ComponentScan({"com.amicus"})
public class MvcConfig implements WebMvcConfigurer {
	
	@Value("${resource.location}")
	private String location;
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/**").addResourceLocations(location);
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new HttpInterceptor())
                .addPathPatterns("/*")
                .excludePathPatterns("/admin/**/")
                .excludePathPatterns("/login"); //로그인 쪽은 예외처리를 한다.
    }
	

}
