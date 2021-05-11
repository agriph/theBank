package com.example.requests;

import io.swagger.annotations.*;

@ApiModel(description = "model for adding a new account")
public class AddAccountRequest {
	
	@ApiModelProperty(notes = "FirstName of the Accountholder")
	private String firstName;
	@ApiModelProperty(notes = "LastName of the Accountholder")
	private String lastName;
	@ApiModelProperty(notes = "Age of the Accountholder")
	private int age;
	@ApiModelProperty(notes = "City of the Accountholder")
	private String city;

	
	public String getFirstName() {
		return firstName;
	}
	
	public String setFirstName() {
		return this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String setLastName() {
		return this.lastName = lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public int setAge() {
		return this.age = age;
	}
	
	public String getCity() {
		return city;
	}
	
	public String setCity() {
		return this.city = city;
	}
	
}
