package com.example.firstwebapp.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Author {
	@Id
	private int authorId;
	private String authorName;
	private int authorAge;
	
	@OneToMany(targetEntity = Book.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "author_id_of_book",referencedColumnName = "authorId")
	private List<Book> book;
	
	
	
	public List<Book> getBook() {
		return book;
	}
	public void setBook(List<Book> book) {
		this.book = book;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getAuthorAge() {
		return authorAge;
	}
	public void setAuthorAge(int authorAge) {
		this.authorAge = authorAge;
	}
	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", authorName=" + authorName + ", authorAge=" + authorAge + "]";
	}
	public Author(int authorId, String authorName, int authorAge) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
		this.authorAge = authorAge;
	}
	public Author() {
		super();
	}
	
	

}
