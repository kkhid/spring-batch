package com.khid.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BatchProcessingApplication {

	public static void main(String[] args) throws Exception {
		System.out.println("開始！！！");
		SpringApplication.run(BatchProcessingApplication.class, args);
		System.out.println("終了！！！");
	}
}