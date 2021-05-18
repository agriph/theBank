package com.bank.requests;


import io.swagger.annotations.*;
import lombok.Data;

@Data

@ApiModel(description = "Model for adding a new account")
public class AddAccountRequest {
	
	@ApiModelProperty(notes = "FirstName of the Accountholder")
	private String firstName;
	@ApiModelProperty(notes = "LastName of the Accountholder")
	private String lastName;
	@ApiModelProperty(notes = "Age of the Accountholder")
	private int age;
	@ApiModelProperty(notes = "City of the Accountholder")
	private String city;
	
	private int sum;

}
