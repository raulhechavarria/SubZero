package com.subzero.domian.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.subzero.domian.type.EnumMeasurement;

@Entity
@Table(name = "users")
public class User {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@Column(name = "user_id")
	private Long id;

	@Column(name = "user_firstname")
	private String name;

	@Column(name = "user_lastname")
	private String lastName;

	@Column(name = "user_login")
	private String login;

	@Column(name = "user_password")
	private String password;

	@Column(name = "namecompany")
	private String company;

	@Column(name = "addresscompany")
	private String address;

	
	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}



	public User(Long id, String name, String lastName, String login, String password, String company, String address) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.login = login;
		this.password = password;
		this.company = company;
		this.address = address;
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
