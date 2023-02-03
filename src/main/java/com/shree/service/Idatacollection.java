package com.shree.service;

import java.util.List;

import com.shree.entity.Planselection;
import com.shree.entity.createcase;

public interface Idatacollection {

	public String getappId(createcase cobj);
	public List<Planselection> getplan();
	//public List<summary> display();
}
