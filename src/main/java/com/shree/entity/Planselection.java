package com.shree.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="plans")
public class Planselection {
	
	private Integer casenumber;
	private String planname;

}
