package tn.food;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AntiGaspillageFoodApplication {

	public static void main(String[] args) {
		SpringApplication.run(AntiGaspillageFoodApplication.class, args);
	}

}
