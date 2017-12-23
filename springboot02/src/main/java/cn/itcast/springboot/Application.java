package cn.itcast.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		SpringApplication a = new SpringApplication(Application.class);
		a.setBannerMode(Mode.OFF);
		a.run(args);
	}
}
