package com.bank.requests;

import java.util.Date;

import io.swagger.annotations.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

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
	@ApiModelProperty(notes = "Date of which the Account was created")
	private Date date;

	
}
