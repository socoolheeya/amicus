package com.amicus.project.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 프로젝트 요청
 * @author socoolheeya
 * @since 2018.08.11
 */
@Entity
@Table(name = "t_request")
public class Request {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(length = 200, nullable = false)
	private String name;
	
	@Column(length = 10)
	private String taker;
	
	@Column(length = 10)
	private String requester;
	
	@Column(name="takedt")
	private LocalDateTime takeDate;

	@Column(name="requestdt")
	private LocalDateTime requestDate;
	
	@Column(length = 1)
	private String state;
	
	@Column(name="createdt")
	private LocalDateTime createDate;
	
	@Column(length = 100)
	private String creater;
	
	@Column(name="updatedt")
	private LocalDateTime updateDate;
	
	@Column(length = 100)
	private String updater;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public LocalDateTime getTakeDate() {
		return takeDate;
	}

	public void setTakeDate(LocalDateTime takeDate) {
		this.takeDate = takeDate;
	}

	public LocalDateTime getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(LocalDateTime requestDate) {
		this.requestDate = requestDate;
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
