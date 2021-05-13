package com.bank.entities;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel(description = "Balance overview")
@Setter
@Getter

public class Balance {
	
	@ApiModelProperty(notes = "ID of the Account")
	private int account;
	@ApiModelProperty(notes = "Current Balance of Account")
	private int balance;


}
