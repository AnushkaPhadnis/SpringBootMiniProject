package com.example.firstwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.firstwebapp.entity.Author;

public interface AuthorRepo extends JpaRepository<Author, Integer> {

}
