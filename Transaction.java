package com.bank.entities;

import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel(description = "Add a new transaction")
@Setter
@Getter

public class Transaction {
	
	@ApiModelProperty(notes = "ID of the Account making the Transaction")
	private int account;
	@ApiModelProperty(notes = "Sum of Purchase")
	private int sum;
	@ApiModelProperty(notes = "Article that was bought")
	private String article;
	@ApiModelProperty(notes = "Date and time of Transaction")
	private Date date;


}