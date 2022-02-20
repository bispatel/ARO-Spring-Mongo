package com.driev.portal.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "ContactDetails")
public class ContactForm {

	private String name;
	private String email;
	private String contact;
	private String comments;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
}
