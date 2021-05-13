package com.bank.entities;

import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel(description = "Add a new transfer")
@Setter
@Getter

public class Transfer {
	
	@ApiModelProperty(notes = "ID of the Account making the Transfer")
	private int account;
	@ApiModelProperty(notes = "Sum of Transfer")
	private int sum;
	@ApiModelProperty(notes = "Date and time Transfer")
	private Date date;


}