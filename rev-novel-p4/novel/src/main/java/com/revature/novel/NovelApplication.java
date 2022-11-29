package com.revature.novel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.revature.novel.beans")
public class NovelApplication {

	public static void main(String[] args) {
		SpringApplication.run(NovelApplication.class, args);
	}

}
