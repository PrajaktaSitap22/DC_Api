package com.shree.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="educationTable")
public class educationDetails {

	private Integer casenumber;
	private String highestDegree;
	private String universityname;
	//private date graduationyear;
	
	
}
