package com.example.firstwebapp.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.firstwebapp.entity.Author;
import com.example.firstwebapp.repository.AuthorRepo;

public class AuthorController {
	@Autowired
	private AuthorRepo authorRepo;
	
	@PostMapping("/addAuthor")
	private Author addAuthor(@RequestBody Author author) {
		return authorRepo.save(author);
	}
	
	@GetMapping("/getAllAuthors")
	private List<Author> getAllAuthors(@RequestBody Author author){
		return authorRepo.findAll();
	}
	
	@GetMapping("/getAuthor/{authorId}")
	private Author getAuthor(@PathVariable("authorId")int authorId) {
	return authorRepo.findById(authorId).get();	
	}

}
