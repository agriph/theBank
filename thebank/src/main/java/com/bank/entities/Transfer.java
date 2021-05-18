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

@ApiModel(description = "Add a new transfer")
@Setter
@Getter
@Entity
@Table(name = "Transfers")
public class Transfer {
	
	@ApiModelProperty(notes = "Id of Transfer")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "transfer_id")
	@Id
	private Long id;
	
	@ApiModelProperty(notes = "Sum of Transfer")
	@Column(name = "transfer_sum")
	private int sum;
	
	@ApiModelProperty(notes = "Date and time Transfer")
	@Column(name = "transfer_date_created")
	private Date date;
	

}
