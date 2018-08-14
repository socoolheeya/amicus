package com.amicus.common.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "t_category")
public class Category {

	@Id
	@Column(name = "category_id")
	private int categoryId;

	@Column(name = "category_name", length = 200)
	private String categoryName;

	private LocalDateTime createdt;
	
	@Column(length = 100)
	private String creater;

	private LocalDateTime updatedt;
	
	@Column(length = 100)
	private String updater;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "code_id")
	private List<Code> codes;

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
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

	public List<Code> getCodes() {
		return codes;
	}

	public void setCodes(List<Code> codes) {
		this.codes = codes;
	}
}
