package com.bank.requests;

import io.swagger.annotations.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter

@ApiModel(description = "information regarding transfers")
public class AddTransferRequest {
	
	@ApiModelProperty(notes = "Name of Accountholder")
	private String name;
	@ApiModelProperty(notes = "The Sum that we want to Transfer")
	private int sum;
	@ApiModelProperty(notes = "Date and Time of which the Transfer were made")
	private Date date;
	
}
