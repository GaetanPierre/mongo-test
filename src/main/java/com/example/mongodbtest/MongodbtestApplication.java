package com.example.mongodbtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.mongodbtest.repository.ItemRepository;

@SpringBootApplication
@EnableMongoRepositories
public class MongodbtestApplication {

	@Autowired
	private ItemRepository itemRepository;

	public static void main(String[] args) {
		SpringApplication.run(MongodbtestApplication.class, args);
	}

}
