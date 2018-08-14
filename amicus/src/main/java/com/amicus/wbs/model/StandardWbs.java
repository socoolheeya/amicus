package com.amicus.wbs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_standard_wbs")
public class StandardWbs {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(length = 500, nullable = false)
	private String name;
	
	@Column(length = 1000)
	private String output;
	
	@Column(length = 1)
	private String type;
}
