package com.amicus.range.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 요구사항
 * @author socoolheeya
 * @since 2018.08.13
 */
@Entity
@Table(name = "t_requirement")
public class Requirement {
	
	@Id
	private String id;
	
	@Column(length = 500)
	private String name;
	
	@Column(length = 4000)
	private String description;
	
	@Column(name = "project_id")
	private Long projectId;
	
	@Column(name = "subproject_id")
	private Long subProjectId;
	
	private LocalDateTime createdt;
	
	@Column(length = 100)
	private String creater;

	private LocalDateTime updatedt;
	
	@Column(length = 100)
	private String updater;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public Long getSubProjectId() {
		return subProjectId;
	}

	public void setSubProjectId(Long subProjectId) {
		this.subProjectId = subProjectId;
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
