package com.shree.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="createcasetable")
public class createcase {
private Integer AppId;

}
