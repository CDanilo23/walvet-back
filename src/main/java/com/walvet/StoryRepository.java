package com.walvet;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StoryRepository extends JpaRepository<Story, Long> {
	
	Collection<Story> findByName(String name);
	
	Story findById(Integer id);
	
	@SuppressWarnings("unchecked")
	Story save(Story person);
}
