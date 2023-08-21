package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="service_centre")
public class ServiceCentre {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int id;
	@Column
	public String name;
	@Column
	public String phone;
	@Column
	public String email;
	
	@ManyToOne
	@JoinColumn(name="area_id")
	Areas area;
	
	@OneToOne
	@JoinColumn(name="login_id")
	Login login;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Areas getArea() {
		return area;
	}

	public void setArea(Areas area) {
		this.area = area;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public ServiceCentre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ServiceCentre(int id, String name, String phone, String email, Areas area, Login login) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.area = area;
		this.login = login;
	}
	
	

}
