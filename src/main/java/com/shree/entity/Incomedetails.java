package com.shree.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="incometable")
public class Incomedetails {

	private Integer casenumber;
	private Long monthincome;
	private Long rentincome;
	private Long propertyincome;
	
	
}
