package com.shree.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shree.entity.Incomedetails;

public interface incomerepo extends JpaRepository<Incomedetails,Serializable>{

}
