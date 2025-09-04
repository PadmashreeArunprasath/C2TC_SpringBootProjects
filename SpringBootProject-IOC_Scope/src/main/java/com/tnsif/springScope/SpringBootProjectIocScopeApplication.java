package com.tnsif.springScope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication

public class SpringBootProjectIocScopeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext var = SpringApplication.run(SpringBootProjectIocScopeApplication.class, args);
//		ConfigurableApplicationContext var = SpringApplication.run(SpringBootProjectIocScopeApplication.class, args);
//		Product p=var.getBean(Product.class);
		Product p=var.getBean(Product.class);
	}

}
