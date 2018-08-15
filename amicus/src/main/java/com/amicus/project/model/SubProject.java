package com.amicus.project.model;

import java.time.LocalDateTime;
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

import com.amicus.range.model.Requirement;

/**
 * 서브프로젝트
 * @author socoolheeya
 * @since 2018.08.11
 */

@Entity
@Table(name = "t_subproject")
public class SubProject {

	@Id
	@GeneratedValue
	private long id;

	@Column(length = 1000, nullable = false)
	private String name;

	@Column(name = "project_id")
	private long projectId;

	@Column(name = "startdt")
	private LocalDateTime startDate;

	@Column(name = "enddt")
	private LocalDateTime EndDate;

	@Column(length = 1)
	private String type;

	@Column(length = 10)
	private String taker;

	@Column(length = 10)
	private String requester;

	@Column(name = "createdt")
	private LocalDateTime createDate;

	@Column(length = 100)
	private String creater;

	@Column(name = "updatedt")
	private LocalDateTime updateDate;

	@Column(length = 100)
	private String updater;

	@Column(length = 1)
	private String delyn;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "subproject_id")
	private List<Requirement> Requirements;
	
	public SubProject() {}
	
	public SubProject(long id, long projectId) {
		this.id = id;
		this.projectId = projectId;
	}

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

	public long getProjectId() {
		return projectId;
	}

	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return EndDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		EndDate = endDate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTaker() {
		return taker;
	}

	public void setTaker(String taker) {
		this.taker = taker;
	}

	public String getRequester() {
		return requester;
	}

	public void setRequester(String requester) {
		this.requester = requester;
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

	public List<Requirement> getRequirements() {
		return Requirements;
	}

	public void setRequirements(List<Requirement> requirements) {
		Requirements = requirements;
	}
}
