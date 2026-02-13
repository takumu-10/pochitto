package com.example.kakeibo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KakeiboApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(KakeiboApiApplication.class, args);
	}
	
	@Bean
    CommandLineRunner init(TestRepository repository) {
        return args -> {
            // DBにあるデータを全部持ってきて表示する
            repository.findAll().forEach(data -> {
                System.out.println("★DBから届いたデータ: " + data.getName() + " (" + data.getMemo() + ")");
            });
        };
    }

}
