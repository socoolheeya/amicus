package com.amicus.range.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_actionitem")
public class ActionItem {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private String content;
	
	@Column(name = "startdt")
	private Date startDate;
	
	@Column(name = "enddt")
	private Date endDate;
	
	private String state;
	
	@Column(name = "createdt")
	private LocalDateTime createDate;

	@Column(length = 50)
	private String creater;

	@Column(name = "updatedt")
	private LocalDateTime updateDate;

	@Column(length = 50)
	private String updater;
	
}
