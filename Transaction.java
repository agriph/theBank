package com.example.entities;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Transaction {
	
	
public Transaction() {
		
	}
	
	public Transaction(int account, int purchase, String article) {
		this.account = account; //id
		this.purchase = purchase;
		this.article = article;

	}
	
	private int account;
	private int purchase;
	private String article;
}
