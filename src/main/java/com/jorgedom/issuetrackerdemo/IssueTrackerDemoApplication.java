package com.jorgedom.issuetrackerdemo;

import controller.IssueController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import repository.IssueRepository;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = IssueRepository.class)
@ComponentScan(basePackageClasses= IssueController.class)
public class IssueTrackerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IssueTrackerDemoApplication.class, args);
	}

}
