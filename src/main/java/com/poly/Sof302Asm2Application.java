package com.poly;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@ComponentScan(basePackageClasses = Sof302Asm2Application.class)
public class Sof302Asm2Application {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(Sof302Asm2Application.class, args);
//		openHomePage();
	}

//	private static void openHomePage() throws IOException {
//		Runtime rt = Runtime.getRuntime();
//		rt.exec("rundll32 url.dll,FileProtocolHandler " + "http://localhost:8080");
//	}
}
