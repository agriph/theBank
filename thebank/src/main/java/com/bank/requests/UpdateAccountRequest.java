package com.bank.requests;

import io.swagger.annotations.*;
import lombok.Data;

@Data

@ApiModel(description = "Update information regarding account")
public class UpdateAccountRequest {

	@ApiModelProperty(notes = "Change FirstName of the Accountholder")
	private String firstName;
	@ApiModelProperty(notes = "Change LastName of the Accountholder")
	private String lastName;
	@ApiModelProperty(notes = "Change Age of the Accountholder")
	private int age;
	@ApiModelProperty(notes = "Change Street of the accountholder")
	private String street;
	@ApiModelProperty(notes = "Change City of the Accountholder")
	private String city;
	@ApiModelProperty(notes = "Change ZipCode of the accountholder")
	private int zipCode;

}