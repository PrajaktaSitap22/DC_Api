package com.shree.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shree.entity.createcase;

public interface createcaserepo extends JpaRepository<createcase,Serializable>{

}
