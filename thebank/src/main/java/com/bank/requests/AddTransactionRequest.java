package com.bank.requests;

import io.swagger.annotations.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@ApiModel(description = "Model for adding transactions")
public class AddTransactionRequest {
	
	@ApiModelProperty(notes = "The Article that was bought")
	private String article;
	@ApiModelProperty(notes = "Details about purchase (sum)")
	private int sum;
	
}
