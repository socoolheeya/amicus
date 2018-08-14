package com.amicus.wbs.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 표준WBS
 * @author socoolheeya
 * @since 2018.08.14
 */
@Entity
@Table(name = "t_standard_wbs")
public class StandardWbs {
	
	@Id
	@GeneratedValue
	@Column(name = "wbs_id")
	private Long wbsId;
	
	@Column(name = "method_id")
	private Long methodId;
	
	@Column(length = 500, nullable = false)
	private String name;
	
	@Column(name = "upper_wbs_id")
	private Long upperWbsId;
	
	@Column(length = 10)
	private String division;
	
	@Column(length = 1000)
	private String output;
	
	@Column(name = "plan_startdt")
	private Date planStartDate;
	
	@Column(name = "plan_enddt")
	private Date planEndDate;
	
	@Column(name = "perform_startdt")
	private Date performStartDate;
	
	@Column(name = "perform_enddt")
	private Date performEndDate;
	
	@Column(length = 10)
	private String state;
	
	@Column(name = "createdt")
	private LocalDateTime createDate;

	@Column(length = 50)
	private String creater;

	@Column(name = "updatedt")
	private LocalDateTime updateDate;

	@Column(length = 50)
	private String updater;

	public Long getWbsId() {
		return wbsId;
	}

	public void setWbsId(Long wbsId) {
		this.wbsId = wbsId;
	}

	public Long getMethodId() {
		return methodId;
	}

	public void setMethodId(Long methodId) {
		this.methodId = methodId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getUpperWbsId() {
		return upperWbsId;
	}

	public void setUpperWbsId(Long upperWbsId) {
		this.upperWbsId = upperWbsId;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public Date getPlanStartDate() {
		return planStartDate;
	}

	public void setPlanStartDate(Date planStartDate) {
		this.planStartDate = planStartDate;
	}

	public Date getPlanEndDate() {
		return planEndDate;
	}

	public void setPlanEndDate(Date planEndDate) {
		this.planEndDate = planEndDate;
	}

	public Date getPerformStartDate() {
		return performStartDate;
	}

	public void setPerformStartDate(Date performStartDate) {
		this.performStartDate = performStartDate;
	}

	public Date getPerformEndDate() {
		return performEndDate;
	}

	public void setPerformEndDate(Date performEndDate) {
		this.performEndDate = performEndDate;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public LocalDateTime getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}

	public String getCreater() {
		return creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
	}

	public LocalDateTime getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdater() {
		return updater;
	}

	public void setUpdater(String updater) {
		this.updater = updater;
	}
}
