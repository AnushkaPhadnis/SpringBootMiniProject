package com.example.firstwebapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.firstwebapp.entity.Book;
import com.example.firstwebapp.entity.Review;

public interface ReviewRepo extends JpaRepository<Review, Integer> {
	
	public List<Review> findBybook(Book book);

}

//Select * from review r inner join book b on b.id=r.review_of_book;