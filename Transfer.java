package com.example.entities;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Transfer {
	
	
public Transfer() {
		
	}
	
	public Transfer(int account, int sum, String info) {
		this.account = account; //id
		this.sum = sum;
		this.info = info;

	}
	
	private int account;
	private int sum;
	private String info;
	
	
	
}
