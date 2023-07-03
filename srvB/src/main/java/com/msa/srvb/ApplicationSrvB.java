package com.msa.srvb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;

@SpringBootApplication
public class ApplicationSrvB {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationSrvB.class, args);
	}

	@Bean
	protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		return http.authorizeHttpRequests((authorizeRequests) -> authorizeRequests.anyRequest().permitAll())
				.csrf().disable().build();
	}
}
