package com.amicus.error.model;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 결함
 * @author socoolheeya
 * @since 2018.08.12
 */
@Entity
@Table(name = "t_error")
public class Error {

	@Id
	@GeneratedValue
	private Long id;

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

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "error_id")
	private List<ErrorHistory> errorHistories;

}
