package com.targettech.CalculatorWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import java.lang.Exception;

@SpringBootApplication
@ComponentScan("com.targettech")
public class CalculatorWebAppApplication {

	public static void main(String[] args)throws Exception {
		SpringApplication.run(CalculatorWebAppApplication.class, args);
	}

}
