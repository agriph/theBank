package com.bank.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel(description = "Add a new account")
@Setter
@Getter
@Entity
@Table(name = "Account")
public class Account {
	
	@ApiModelProperty(notes = "Identification of the account")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ApiModelProperty(notes = "FirstName of the accountholder")
	@Column(name = "first_name")
	private String firstName;
	
	@ApiModelProperty(notes = "LastName of the accountholder")
	@Column(name = "last_name")
	private String lastName;
	
	@ApiModelProperty(notes = "Age of the accountholder")
	@Column(name = "age")
	private int age;
	
	@ApiModelProperty(notes = "Street of the accountholder")
	@Column(name = "street")
	private String street;
	
	@ApiModelProperty(notes = "City of the accountholder")
	@Column(name = "city")
	private String city;
	
	@ApiModelProperty(notes = "ZipCode of the accountholder")
	@Column(name = "zipcode")
	private int zipCode;
	
	@ApiModelProperty(notes = "Date of which the Account was created")
	@Column(name = "date_created")
	private Date date;
	
	@ApiModelProperty(notes = "Date of which the Account was updated")
	@Column(name = "date_updated")
	private Date update;
	
	@OneToOne
	private Balance balance;


}

