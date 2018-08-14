package com.amicus.object.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 객체
 * @author socoolheeya
 * @since 2018.08.13
 */
@Entity
@Table(name = "t_object")
public class Object {

	@Id
	@Column(name = "wbs_id")
	private Long wbsId;
	
	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "object_name", length = 100)
	private String objectNmae;
	
	@Column(length = 10)
	private String type;
	
	@Column(name = "charge_id", length = 50)
	private String chargeId;
	
	@Column(name = "charge_team", length = 100)
	private String chargeTeam;
	
	@Column(name = "plan_startdt")
	private Date planStartDate;
	
	@Column(name = "plan_enddt")
	private Date planEndDate;
	
	@Column(name = "perform_startdt")
	private Date performStartDate;
	
	@Column(name = "perform_startdt")
	private Date performEndDate;
	
	private double progress;
	
	private double weight;
	
	@Column(name = "dev_cplyn")
	private String devCompleteYn;
	
	@Column(name = "dev_test")
	private String devTest;
	
	@Column(name = "dev_confirmdt")
	private Date devConfirmDate;
	
	@Column(name = "pl_cplyn")
	private String plCompleteYn;
	
	@Column(name = "pl_test")
	private String plTest;
	
	@Column(name = "pl_confirmdt")
	private Date plConfirmDate;
	
	@Column(name = "client_cplyn")
	private String clientCompleteYn;
	
	@Column(name = "client_test")
	private String clientTest;
	
	@Column(name = "client_confirmdt")
	private Date clientConfirmDate;
	
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getObjectNmae() {
		return objectNmae;
	}

	public void setObjectNmae(String objectNmae) {
		this.objectNmae = objectNmae;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getChargeId() {
		return chargeId;
	}

	public void setChargeId(String chargeId) {
		this.chargeId = chargeId;
	}

	public String getChargeTeam() {
		return chargeTeam;
	}

	public void setChargeTeam(String chargeTeam) {
		this.chargeTeam = chargeTeam;
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

	public double getProgress() {
		return progress;
	}

	public void setProgress(double progress) {
		this.progress = progress;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getDevCompleteYn() {
		return devCompleteYn;
	}

	public void setDevCompleteYn(String devCompleteYn) {
		this.devCompleteYn = devCompleteYn;
	}

	public String getDevTest() {
		return devTest;
	}

	public void setDevTest(String devTest) {
		this.devTest = devTest;
	}

	public Date getDevConfirmDate() {
		return devConfirmDate;
	}

	public void setDevConfirmDate(Date devConfirmDate) {
		this.devConfirmDate = devConfirmDate;
	}

	public String getPlCompleteYn() {
		return plCompleteYn;
	}

	public void setPlCompleteYn(String plCompleteYn) {
		this.plCompleteYn = plCompleteYn;
	}

	public String getPlTest() {
		return plTest;
	}

	public void setPlTest(String plTest) {
		this.plTest = plTest;
	}

	public Date getPlConfirmDate() {
		return plConfirmDate;
	}

	public void setPlConfirmDate(Date plConfirmDate) {
		this.plConfirmDate = plConfirmDate;
	}

	public String getClientCompleteYn() {
		return clientCompleteYn;
	}

	public void setClientCompleteYn(String clientCompleteYn) {
		this.clientCompleteYn = clientCompleteYn;
	}

	public String getClientTest() {
		return clientTest;
	}

	public void setClientTest(String clientTest) {
		this.clientTest = clientTest;
	}

	public Date getClientConfirmDate() {
		return clientConfirmDate;
	}

	public void setClientConfirmDate(Date clientConfirmDate) {
		this.clientConfirmDate = clientConfirmDate;
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
