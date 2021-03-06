package com.amicus.defect.model;

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
 * @since 2018.08.17
 */
@Entity
@Table(name = "t_defect")
public class Defect {

	@Id
	@GeneratedValue
	private long id;

	@Column(length = 200)
	private String name;

	@Column(name = "charge_id", length = 50)
	private String chargeId;

	@Column(length = 4000)
	private String content;

	@Column(name = "chargedt")
	private Date chargeDate;

	@Column(name = "measure_id", length = 50)
	private String measureId;

	@Column(name = "measure_method", length = 100)
	private String measureMethod;
	
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
	@JoinColumn(name = "defect_id")
	private List<DefectHistory> defectHistories;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getChargeId() {
		return chargeId;
	}

	public void setChargeId(String chargeId) {
		this.chargeId = chargeId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getChargeDate() {
		return chargeDate;
	}

	public void setChargeDate(Date chargeDate) {
		this.chargeDate = chargeDate;
	}

	public String getMeasureId() {
		return measureId;
	}

	public void setMeasureId(String measureId) {
		this.measureId = measureId;
	}

	public String getMeasureMethod() {
		return measureMethod;
	}

	public void setMeasureMethod(String measureMethod) {
		this.measureMethod = measureMethod;
	}

	public String getMeasure() {
		return measure;
	}

	public void setMeasure(String measure) {
		this.measure = measure;
	}

	public Date getMeasureDate() {
		return measureDate;
	}

	public void setMeasureDate(Date measureDate) {
		this.measureDate = measureDate;
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

	public List<DefectHistory> getErrorHistories() {
		return defectHistories;
	}

	public void setErrorHistories(List<DefectHistory> defectHistories) {
		this.defectHistories = defectHistories;
	}

	public String getUpdater() {
		return updater;
	}

	public void setUpdater(String updater) {
		this.updater = updater;
	}
}
