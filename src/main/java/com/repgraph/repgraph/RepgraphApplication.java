package com.repgraph.repgraph;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.repgraph"})
public class RepgraphApplication {

	public static void main(String[] args) {
		SpringApplication.run(RepgraphApplication.class, args);
	}

}
