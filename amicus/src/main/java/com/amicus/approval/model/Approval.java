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
	private Long id;

	@NotNull
	@Column(length = 1000)
	private String name;

	@Column(length = 1000)
	private String type;
 
	/**
	 * 결재종류: 진행중(1), 완료(2), 반려(3)
	 */
	@Column(length = 1)
	private String state;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private List<ApprovalLine> approvalLines;
}
