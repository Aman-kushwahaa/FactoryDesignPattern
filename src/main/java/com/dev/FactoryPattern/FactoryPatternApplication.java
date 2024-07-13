package com.dev.FactoryPattern;

import com.dev.FactoryPattern.OS.OSFactory;
import com.dev.FactoryPattern.OS.OSType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(FactoryPatternApplication.class, args);

		OSFactory osFactory = new OSFactory();
		OSType type1 = osFactory.getInstance("opensource");
		OSType type2 = osFactory.getInstance("secureos");
		OSType type3 = osFactory.getInstance("anyos");

		type1.osType();
		type2.osType();
		type3.osType();


	}

}
