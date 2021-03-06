package com.amicus.approval.model;

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
import javax.validation.constraints.NotNull;

/**
 * 결재마스터
 * @author socoolheeya
 * @since 2018.08.13
 */
@Entity
@Table(name = "t_approval")
public class Approval {

	@Id
	@GeneratedValue
	private long id;

	@NotNull
	@Column(length = 1000)
	private String name;

	@Column(length = 1000)
	private String type;
 
	/**
	 * @see enum ApprovalState
	 */
	@Column(length = 1)
	private String state;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private List<ApprovalLine> approvalLines;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public List<ApprovalLine> getApprovalLines() {
		return approvalLines;
	}

	public void setApprovalLines(List<ApprovalLine> approvalLines) {
		this.approvalLines = approvalLines;
	}
}
