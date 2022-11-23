package com.example.firstwebapp.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import com.example.firstwebapp.entity.Book;
import com.example.firstwebapp.repository.AuthorRepo;
import com.example.firstwebapp.repository.BookRepo;
import com.example.firstwebapp.repository.ReviewRepo;

@RestController
public class BookController {
	@Autowired
	private BookRepo bookRepo;
	@Autowired
	private AuthorRepo authorRepo;
	
	
	@PostMapping("/addBook")
	private Book addBook(@RequestBody Book book) {
		return bookRepo.save(book);
	}
	
	@GetMapping("/getAllBooks")
	private List<Book> getAllBooks() {
		return bookRepo.findAll();
	}
	
	
	@GetMapping("/getBook/{bookId}")
	private Book getBook(@PathVariable("bookId") int bookId) {
		return bookRepo.findById(bookId).get() ;
	}
	
	@PatchMapping("/editBook/{bookId}")
	private ResponseEntity<String> editBook(@RequestBody Book book,@PathVariable("bookId") int bookId){
		bookRepo.save(book);
	return 	ResponseEntity.ok("Updation Successful !!");
	}
	
	


}
