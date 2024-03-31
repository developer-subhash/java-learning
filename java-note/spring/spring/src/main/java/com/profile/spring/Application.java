package com.profile.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@SpringBootApplication
@EnableAutoConfiguration
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	MyProperties mp;
	@Override
	public void run(String... args) throws Exception {
		System.out.println("my properties " + mp.getUsername());
		System.out.println("whenever application start, this method will run");

		String fileName = "C:\\java\\spring\\" + mp.getUsername() + ".txt"; // Name of the file to be created

		try {
			// Create a BufferedWriter object to write to the file
			BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

			// Write content to the file
			writer.write("This is a new file created in Java!");
			writer.newLine(); // Writing a new line
			writer.write("Adding more content to the file.");

			// Close the writer to release resources
			writer.close();

			System.out.println("File created successfully.");
		} catch (IOException e) {
			System.err.println("Error occurred while creating the file: " + e.getMessage());
		}
	}

}
