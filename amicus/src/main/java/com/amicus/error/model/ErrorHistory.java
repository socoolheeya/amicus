package com.amicus.error.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 결함이력
 * @author socoolheeya
 * @since 2018.08.12
 */
@Entity
@Table(name="t_error_history")
public class ErrorHistory {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "error_id")
	private Long error_id;
	
	@Column(length = 200)
	private String name;

	@Column(name = "raise_id", length = 50)
	private String raiseId;

	@Column(length = 4000)
	private String content;

	@Column(name = "raisedt")
	private Date raiseDate;

	@Column(name = "measure_id", length = 50)
	private String measureId;

	@Column(length = 4000)
	private String measure;

	@Column(name = "measuredt")
	private Date measureDate;

	@Column(length = 20)
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
