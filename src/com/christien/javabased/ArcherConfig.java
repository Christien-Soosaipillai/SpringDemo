package com.christien.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(LicenseConfig.class)
public class ArcherConfig {
	
	@Bean
	public Archer archer() {
		return new Archer("Christien", bow());
	}
	
	@Bean
	public Bow bow() {
		return new Bow("Hoyt", 599.99);
	}
}
