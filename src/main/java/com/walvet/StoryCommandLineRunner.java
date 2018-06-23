package com.walvet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StoryCommandLineRunner implements CommandLineRunner{

	@Override
	public void run(String... arg0) throws Exception {
		for(Story book : storyRepository.findAll()) {
			System.out.println(book.getName());
		}
	}
	
	@Autowired
	StoryRepository storyRepository;
	
	
}
