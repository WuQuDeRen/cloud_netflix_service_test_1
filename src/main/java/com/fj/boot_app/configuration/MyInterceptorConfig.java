package com.fj.boot_app.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.fj.boot.app.interceptor.MyInterceptor1;

@Configuration
public class MyInterceptorConfig implements WebMvcConfigurer {
	
	@Autowired
	private MyInterceptor1 myInterceptor1;
	
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(myInterceptor1).addPathPatterns(new String[]{"/test/**"});
	}
}
