package com.elk.stack.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		Logger logger = LoggerFactory.getLogger(Application.class);

		logger.debug("Iniciando Debug");
		logger.info("Iniciando o projeto {INFO}");
		logger.error("Iniciando o Error {ERROR}");


	}

}