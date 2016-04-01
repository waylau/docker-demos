package com.waylau.docker_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
/**
 * 主应用入口
 * @author <a href="http://waylau.com">waylau.com</a>
 * @date 2016年3月19日
 */
@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/")
	public String home() {
		return "Hello Docker World. <br />"
				+ "Welcome to <a href='http://waylau.com'>waylau.com</a></li>";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
