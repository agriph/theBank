package com.bank.requests;

import java.util.List;

import com.bank.entities.Transaction;
import com.bank.entities.Transfer;

import io.swagger.annotations.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@ApiModel(description = "Model for adding a new balance to account")
public class AddBalanceRequest {
	
	@ApiModelProperty(notes = "Current balance")
	private int sum;
	
	private List<Transfer> transfers;
	private List<Transaction> transactions;
}