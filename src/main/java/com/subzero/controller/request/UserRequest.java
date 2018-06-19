package com.subzero.controller.request;

import java.util.List;

import com.subzero.domian.entity.Email;

public class UserRequest {

	private Long id;

	private String name;

	private String lastName;

	private String login;

	private String password;

	private String company;

	private String address;
	
	private List<EmailRequest> emails;
	

	public List<EmailRequest> getEmails() {
		return emails;
	}

	public void setEmails(List<EmailRequest> emails) {
		this.emails = emails;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
