package com.example.firstwebapp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Review {
	
	@Id
	private int reviewId;
	private String reviewComment;
	private int reviewRating;
	
	@ManyToOne
	@JoinColumn(name = "bookId")
	private Book book;
	
	public int getReviewId() {
		return reviewId;
	}
	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}
	public String getReviewComment() {
		return reviewComment;
	}
	public void setReviewComment(String reviewComment) {
		this.reviewComment = reviewComment;
	}
	public int getReviewRating() {
		return reviewRating;
	}
	public void setReviewRating(int reviewRating) {
		this.reviewRating = reviewRating;
	}
	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", reviewComment=" + reviewComment + ", reviewRating=" + reviewRating
				+ "]";
	}
	public Review(int reviewId, String reviewComment, int reviewRating) {
		super();
		this.reviewId = reviewId;
		this.reviewComment = reviewComment;
		this.reviewRating = reviewRating;
	}
	public Review() {
		super();
	}
	
	

}
