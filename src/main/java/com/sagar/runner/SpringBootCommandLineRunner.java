
package com.sagar.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SpringBootCommandLineRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hii Commandline Runner");

	}
	public int getOrder() {
		return 50;
		
	}

}
