package com.example.model;

import java.io.Serializable;

public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;
	int id = 0;
	String name = null;
	String surname = null;
	String address = null;
	String phone = null;

	public Customer(int id, String name, String surname, String address,
			String phone) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.address = address;
		this.phone = phone;
	}

	public Customer() {
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", surname=" + surname
				+ ", address=" + address + ", phone=" + phone + "]";
	}

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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}