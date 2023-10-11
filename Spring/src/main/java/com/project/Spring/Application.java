package com.project.Spring;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/user")
	public Principal user(Principal user) {
		return user;
	}
	
	@RequestMapping("/resource")
	public Map<String,Object> home(){
		Map<String,Object> model = new HashMap<String, Object>();
		model.put("id", UUID.randomUUID().toString());
		model.put("content", "A productive day is a day when you grow as a person.");
		return model;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	  @Configuration
	  @Order(1)
	  protected static class SecurityConfiguration {
		  @Bean
		    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	      http
	        .httpBasic()
	      .and()
	        .authorizeRequests()
	          .requestMatchers("/index.html", "/", "/home", "/login").permitAll()
	          .anyRequest().authenticated().and().csrf()
	          .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());
	      return http.build();
	    }
	  }

	}
