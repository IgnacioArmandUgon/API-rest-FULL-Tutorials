package com.books.integrate.spring.react.model;

import javax.persistence.*;

@Entity
@Table(name = "tutorials")
public class Tutorial {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@Column(name = "published")
	private boolean published;

	@Column(name = "price")
	private Long price;

	public Tutorial() {

	}

	public Tutorial(String title, String description, Long price, boolean published) {
		this.title = title;
		this.description = description;
		this.price = price;
		this.published = published;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getPrice() {return price;}

	public void setPrice(Long price) {this.price = price;}

	public boolean isPublished() {return published;}

	public void setPublished(boolean isPublished) {this.published = isPublished;}

	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
	}

}
