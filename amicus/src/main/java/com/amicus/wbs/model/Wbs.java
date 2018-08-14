package com.amicus.wbs.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t_wbs")
public class Wbs {

	@Id
	@GeneratedValue
	@Column(name = "wbs_id")
	private Long wbsid;

	@Column(name = "wbs_name",length = 500, nullable = false)
	private String wbsName;

	@Column(name = "upper_id")
	private Long upperId;

	/**
	 * 구분: 단계(1), 활동(2), 공정(3)
	 */
	@Column(length = 1)
	private String division;

	@Column(length = 2000)
	private String output;

	@Column(name = "plan_startdt")
	private Date planStartDate;

	@Column(name = "plan_enddt")
	private Date planEndDate;

	@Column(name = "perform_startdt")
	private Date performStartDate;

	@Column(name = "perform_enddt")
	private Date performEndDate;

	/**
	 * 상태: 미도래(1), 진행중(2), 완료(3)
	 */
	@Column(length = 1)
	private String state;

	@Column(name = "createdt")
	private LocalDateTime createDate;
	
	@Column(length = 50)
	private String creater;

	@Column(name = "updatedt")
	private LocalDateTime updateDate;
	
	@Column(length = 50)
	private String updater;

	@Column(length = 1)
	private String delyn;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "wbs_id")
	private OutputFile outputfiles;
}
