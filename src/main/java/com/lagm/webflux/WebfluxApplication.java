package com.lagm.webflux;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebfluxApplication implements ApplicationRunner {

	private static final Logger logger = LogManager.getLogger(WebfluxApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(WebfluxApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		logger.debug("Debug de la aplicacion");
		logger.info("Info log");
		logger.warn("Este es una alerta");
		logger.error("Este es un error");
		logger.fatal("Error Fatal");
	}
}
