package com.subzero.service.dto;

import com.subzero.domian.entity.Email;
import com.subzero.domian.entity.User;

public class SaveEmailDto {

	private Long Id;
	
	private User user;
	
	private Long idEmails;
	
	private String email;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Long getIdEmails() {
		return idEmails;
	}

	public void setIdEmails(Long idEmails) {
		this.idEmails = idEmails;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
