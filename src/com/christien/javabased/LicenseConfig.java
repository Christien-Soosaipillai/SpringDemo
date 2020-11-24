package com.christien.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LicenseConfig {
	
	@Bean(initMethod = "init", destroyMethod = "cleanup" )
	public License license(){
		return new License(tag(), Level.HUNTER);
	}
	
	@Bean
	public Tag tag(){
		return new Tag();
	}
	
	
}
