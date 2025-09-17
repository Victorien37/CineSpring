package com.vico.cinespring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import com.vico.cinespring.service.BusinessService;
import com.vico.cinespring.model.HelloWord;

@SpringBootApplication
public class SpringbootDemoApplication implements CommandLineRunner {

	@Autowired
	private BusinessService bs;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}

	@Override
    public void run(String... args) throws Exception {
		HelloWord hw = bs.getHelloWord();
        System.out.println(hw);
    }
}