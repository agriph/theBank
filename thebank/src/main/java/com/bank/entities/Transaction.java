package com.bank.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.*;
import lombok.Getter;
import lombok.Setter;

@ApiModel(description = "Add a new transaction")
@Setter
@Getter
@Entity
@Table(name = "Transactions")
public class Transaction {
	
	@ApiModelProperty(notes = "Id of Transaction")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "transaction_id")
	@Id
	private Long id;
	
	@ApiModelProperty(notes = "Sum of Purchase")
	@Column(name = "transaction_sum")
	private int sum;
	
	@ApiModelProperty(notes = "Article that was bought")
	@Column(name = "transaction_article")
	private String article;
	
	@ApiModelProperty(notes = "Date and time of Transaction")
	@Column(name = "transaction_date_created")
	private Date date;


}
