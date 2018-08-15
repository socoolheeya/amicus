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
	@Column(name = "error_hist_id")
	private long errorHistId;
	
	@Column(name = "error_id")
	private long errorId;
	
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

	public long getErrorHistId() {
		return errorHistId;
	}

	public void setErrorHistId(long errorHistId) {
		this.errorHistId = errorHistId;
	}

	public long getErrorId() {
		return errorId;
	}

	public void setErrorId(long errorId) {
		this.errorId = errorId;
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

	public String getUpdater() {
		return updater;
	}

	public void setUpdater(String updater) {
		this.updater = updater;
	}
}
