package com.bank.requests;

import io.swagger.annotations.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@ApiModel(description = "Update information regarding balance")
public class UpdateBalanceRequest {
	
	@ApiModelProperty(notes = "Update sum")
	private int sum;
	
}