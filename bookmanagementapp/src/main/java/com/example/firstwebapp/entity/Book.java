package com.example.firstwebapp.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Book {
	@Id
	private int bookId;
	private String bookName;
	private String bookDescription;
	private int bookPublishYear;
	
	@OneToMany(mappedBy = "book")
	private List<Review> review;
	
	public List<Review> getReview() {
		return review;
	}
	public void setReview(List<Review> review) {
		this.review = review;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookDescription() {
		return bookDescription;
	}
	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}
	public int getBookPublishYear() {
		return bookPublishYear;
	}
	public void setBookPublishYear(int bookPublishYear) {
		this.bookPublishYear = bookPublishYear;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookDescription=" + bookDescription
				+ ", bookPublishYear=" + bookPublishYear + "]";
	}
	public Book(int bookId, String bookName, String bookDescription, int bookPublishYear) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookDescription = bookDescription;
		this.bookPublishYear = bookPublishYear;
	}
	public Book() {
		super();
	}
	
	

}
