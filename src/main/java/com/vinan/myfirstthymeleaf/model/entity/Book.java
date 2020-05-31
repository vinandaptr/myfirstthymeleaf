package com.vinan.myfirstthymeleaf.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "t_book")
@Data
public class Book {
	
	@Id
	private Integer id;
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "id_biodata")
	private Biodata biodata;
	

}
