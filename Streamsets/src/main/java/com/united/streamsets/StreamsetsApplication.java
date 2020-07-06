package com.united.streamsets;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class StreamsetsApplication {
	

@Value("${streamSets.username}")
String username;
@Value("${streamSets.password}")
String password;

	public static void main(String[] args) {
		SpringApplication.run(StreamsetsApplication.class, args);
	}
	
	@Bean
	public RestTemplate authenticationTemplate() {
		RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
		return restTemplateBuilder.basicAuthentication(username, password).build();
	}

}



