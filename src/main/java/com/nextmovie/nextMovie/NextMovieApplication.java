package com.nextmovie.nextMovie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class NextMovieApplication {

	public static void main(String[] args) {
		SpringApplication.run(NextMovieApplication.class, args);
	}

}
