package com.epam.engx.cleancode.naming.task2;

import java.util.Arrays;
import java.util.Date;

public class User {

	private Date dateOfBirth;

	private String name;

	private boolean isAdmin;

	private User[] users;

	private int rating;

	public User(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [dateOfBirth=" + dateOfBirth + ", Name=" + name + ", isAdmin=" + isAdmin + ", Users="
				+ Arrays.toString(users) + ", Rating=" + rating + "]";
	}

}
