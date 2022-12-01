package com.revature.novel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.hibernate.cfg.Configuration;
import com.revature.novel.models.*;

@SpringBootApplication(scanBasePackages = "com.revature.novel.beans")
public class NovelApplication {

	public static void main(String[] args) {
		SpringApplication.run(NovelApplication.class, args);
	}

}
