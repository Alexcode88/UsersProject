package com.codingdojo.models;

public class User {
	private String firstName;
	private String lastName;
	private int identifier;
	
	public User( String firstName, String lastName, int identifier ) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.identifier = identifier;
	}
	
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(int identifier) {
		this.identifier = identifier;
	}
}
