package com.bank.requests;

import io.swagger.annotations.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@ApiModel(description = "Model for adding transfers")
public class AddTransferRequest {
	
	@ApiModelProperty(notes = "The Sum that we want to Transfer")
	private int sum;
	
}
