package com.bank.requests;

import io.swagger.annotations.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@ApiModel(description = "Update information regarding transactions")
public class UpdateTransactionRequest {
	
	@ApiModelProperty(notes = "Update information")
	private String article;
	@ApiModelProperty(notes = "Update sum")
	private int sum;
	
}
