package com.shree.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.shree.entity.Planselection;
import com.shree.entity.createcase;
import com.shree.repository.createcaserepo;
import com.shree.repository.planselectionrepo;

public class datacollectionImpl implements Idatacollection {
 
	@Autowired
	createcaserepo crepo;
	
	@Autowired 
	planselectionrepo planrepo;
	
	@Override
	public String getappId(createcase cobj) {
		
		return crepo.findById();
		
	}

	@Override
	public List<Planselection> getplan() {
		
		return null;
	}

}
