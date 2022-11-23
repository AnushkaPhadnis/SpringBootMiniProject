package com.example.firstwebapp.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.firstwebapp.entity.Book;
import com.example.firstwebapp.entity.Review;
import com.example.firstwebapp.repository.BookRepo;
import com.example.firstwebapp.repository.ReviewRepo;

@RestController
public class ReviewController {

	@Autowired
	private ReviewRepo reviewRepo;
	@Autowired
	private BookRepo bookRepo;
	
	@PostMapping("/addReview")
	private Review addReview(@RequestBody Review review) {
		return reviewRepo.save(review);
	}
	
	@GetMapping("/getReview/{bookId}")
	private List<Review> getReviewbyBookId(@PathVariable("bookId")int bookId) {
		Book b=bookRepo.findById(bookId).orElse(null);
		return reviewRepo.findBybook(b);
	}
	
	
	@GetMapping("/getAllReviews")
	private List<Review> getAllReviews() {
		return reviewRepo.findAll();
	}
	
	@GetMapping("/getReview/{reviewId}")
	private Review getReview(@PathVariable("reviewId") int reviewId) {
		return reviewRepo.findById(reviewId).get();
	}
}
