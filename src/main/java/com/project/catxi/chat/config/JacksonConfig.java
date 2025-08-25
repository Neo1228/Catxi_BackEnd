package com.project.catxi.chat.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

@Configuration
public class JacksonConfig {

	@Bean
	@Primary
	public ObjectMapper objectMapper(){
		ObjectMapper om= new ObjectMapper();
		om.registerModule(new JavaTimeModule());
		om.disable(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS);
		return om;
	}
}
