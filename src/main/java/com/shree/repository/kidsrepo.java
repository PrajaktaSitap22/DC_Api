package com.shree.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shree.entity.kidsDetails;

public interface kidsrepo extends JpaRepository <kidsDetails,Serializable>{

}
