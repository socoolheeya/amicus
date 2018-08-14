package com.amicus.common.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 코드정보
 * @author socoolheeya
 * @since 2018.08.12
 *
 */
@Entity
@Table(name = "t_code")
public class Code {

	@Id
	@Column(name = "code_id")
	private int codeId;

	@Column(name = "code_name", length = 200)
	private String codeName;

	@Column(name = "category_id")
	private int categoryId;
	
	private int order;

	private LocalDateTime createdt;
	
	@Column(length = 100)
	private String creater;

	private LocalDateTime updatedt;
	
	@Column(length = 100)
	private String updater;
	
	public Code() {}

	public int getCodeId() {
		return codeId;
	}

	public void setCodeId(int codeId) {
		this.codeId = codeId;
	}

	public String getCodeName() {
		return codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public LocalDateTime getCreatedt() {
		return createdt;
	}

	public void setCreatedt(LocalDateTime createdt) {
		this.createdt = createdt;
	}

	public String getCreater() {
		return creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
	}

	public LocalDateTime getUpdatedt() {
		return updatedt;
	}

	public void setUpdatedt(LocalDateTime updatedt) {
		this.updatedt = updatedt;
	}

	public String getUpdater() {
		return updater;
	}

	public void setUpdater(String updater) {
		this.updater = updater;
	}
}
