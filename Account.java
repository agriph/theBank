package com.bank.entities;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel(description = "Add a new account")
@Setter
@Getter

public class Account {
	
	@ApiModelProperty(notes = "Identification of the account")
	private int id;
	@ApiModelProperty(notes = "FirstName of the accountholder")
	private String firstName;
	@ApiModelProperty(notes = "LastName of the accountholder")
	private String lastName;
	@ApiModelProperty(notes = "Age of the accountholder")
	private int age;
	@ApiModelProperty(notes = "Adress of the accountholder")
	private String adress;
	@ApiModelProperty(notes = "City of the accountholder")
	private String city;
	@ApiModelProperty(notes = "ZipCode of the accountholder")
	private int zipCode;


}

