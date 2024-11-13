package io.github.antonio.fantoni.arquiteturaSpring;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.sql.SQLOutput;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		//SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);
		//builder.bannerMode(Banner.Mode.OFF);
		//builder.run(args);
		System.out.println("Working!!!");

	}

}
