package com.shree.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shree.entity.Planselection;

public interface educationrepo extends JpaRepository<Planselection,Serializable> {

}
