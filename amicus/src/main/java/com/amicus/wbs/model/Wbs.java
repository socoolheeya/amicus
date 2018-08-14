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

/**
 * WBS 
 * @author socoolheeya
 * @since 2018.08.14
 */
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

	public Long getWbsid() {
		return wbsid;
	}

	public void setWbsid(Long wbsid) {
		this.wbsid = wbsid;
	}

	public String getWbsName() {
		return wbsName;
	}

	public void setWbsName(String wbsName) {
		this.wbsName = wbsName;
	}

	public Long getUpperId() {
		return upperId;
	}

	public void setUpperId(Long upperId) {
		this.upperId = upperId;
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

	public String getDelyn() {
		return delyn;
	}

	public void setDelyn(String delyn) {
		this.delyn = delyn;
	}

	public OutputFile getOutputfiles() {
		return outputfiles;
	}

	public void setOutputfiles(OutputFile outputfiles) {
		this.outputfiles = outputfiles;
	}
}
