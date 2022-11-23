package com.example.firstwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.firstwebapp.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

}
