package com.bank.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.swagger.annotations.*;
import lombok.Getter;
import lombok.Setter;

@ApiModel(description = "Balance overview")
@Setter
@Getter
@Entity
@Table(name = "Balance")
public class Balance {
	
	@ApiModelProperty(notes = "Id of Balance")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "balance_id")
	private Long id;
	@ApiModelProperty(notes = "Current Balance of Account")
	@Column(name = "balance_sum")
	private int sum;
	@ApiModelProperty(notes = "Date of which the Balance was created")
	@Column(name = "balance_date_created")
	private Date date;
	@ApiModelProperty(notes = "Date of which the Balance was updated")
	@Column(name = "balance_date_updated")
	private Date update;
	
	@ElementCollection(targetClass=Transaction.class)
	private List<Transaction> transactions;
	
	@ElementCollection(targetClass=Transfer.class)
	private List<Transfer> transfers;

}
