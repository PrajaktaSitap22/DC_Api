package com.shree.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="kidsTable")
public class kidsDetails {

	private String kidname;
	private Integer kidage;
	private Long ssn;
	
	
}
