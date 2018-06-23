package com.walvet;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonAnyFormatVisitor;

@RestController
@CrossOrigin(allowedHeaders="*",allowCredentials="true")
public class StoryRestController {
		
	@Autowired
	StoryRepository storyRepository;
	
	@RequestMapping(produces="application/json",value="/story",method=RequestMethod.GET)
	Collection<Story> findAll(){
		return this.storyRepository.findAll();
	}
	
	@RequestMapping(produces="application/json",value="/story/{id}",method=RequestMethod.GET)
	public Story getStoryById(@PathVariable("id") int id) {
		return this.storyRepository.findById(id);
	}
	
//	@RequestMapping(consumes= {"application/json"} , value="/auth", method=RequestMethod.PUT)
//	public ResponseEntity<Story> authentication(@RequestBody Story story) {
//		System.out.println("Entro con nombre valor => "+person.getName());
//		System.out.println("Entro con nombre valor => "+person.getPassword());
//		person.setToken("12345");
//		return ResponseEntity.ok(person);
//	}
	
//	@RequestMapping(value="/persons/{id}",method=RequestMethod.PUT)
//	public ResponseEntity<Book> updateUser(@PathVariable("id") int id, @RequestBody Book person ){
//		System.out.println(id+person.toString());
//		Book currentPerson = personRepository.findById(id);
//		if(currentPerson==null) {
//			System.out.println(" Person with id => "+id+" doesn't found");
//			return new ResponseEntity<Book>(HttpStatus.NOT_FOUND);
//		}
//		
//		return  new ResponseEntity<Book>(HttpStatus.OK);
//	}
}
