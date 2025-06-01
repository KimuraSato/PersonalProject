package com.projetopessoal.Projeto.pessoal.aula.Ezequias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ProjetoPessoalAulaEzequiasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoPessoalAulaEzequiasApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedOrigins("*")
						.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Allowed methods
						.allowedHeaders("Authorization", "Content-Type") // Allowed header
						.maxAge(3600); // Cache preflight response for 1 hour;
			}
		};
	}

}

