package com.infotech.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
//import javax.validation.constraints.Min;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Pattern;
//import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;

//import org.hibernate.validator.constraints.Email;
//import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "books1")
public class Student {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id; 
	


	//@NotEmpty
	//@Pattern(regexp="[^0-9]+")
	//@Size(min=6,max=20)
	@Column(name = "bookname")
	String BookName;
	

	//@NotEmpty
	//@Pattern(regexp="[^0-9]+")
	//@Size(min=6,max=20)
	@Column(name = "bookid")
	 String BookId;
	
	//@NotEmpty
	//@Pattern(regexp="[^0-9]+")
	//@Size(min=6,max=20)
	@Column(name = "author")
	String Author;
	
	public String getBookName() {
		return BookName;
	}

	public void setBookName(String bookName) {
		BookName = bookName;
	}

	public String getBookId() {
		return BookId;
	}

	public void setBookId(String bookId) {
		BookId = bookId;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	
	/*
	@NotEmpty
	@Column(name = "gender")
	private String gender;
	
	@Size(min=1)
	@NotNull
	@Column(name = "technology")
	private String technology;
	
	@NotEmpty
	@Column(name = "city")
	private String city;
	
	@NotEmpty
	@Email
	@Column(name = "email")
	private String email;
	
	@NotEmpty
	@Column(name = "password")
	private String password;
	
	@NotNull
	@Min(value = 1000000000)
	@Column(name = "phone")
	private Long phone;

	public String getBookName() {
		return BookName;
	}

	public void setBookName(String BookName) {
		this.BookName = BookName;
	}
	public String getBookId() {
		return BookId;
	}

	public void setBookId(String BookId) {
		this.BookId = BookId;
	}
	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String Author) {
		this.Author = Author;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public Long getPhone() {
		return phone;
	}
	
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	*/
}
