package com.amicus.approval.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 결재라인
 * @author socoolheeya
 * @since 2018.08.13
 */

@Entity
@Table(name = "t_approval_line")
public class ApprovalLine {
	
	@Id
	private Long id;
	
	/**
	 * 결재역할: 기안자(1), 승인자(2)
	 */
	@Column(length = 10)
	private String role;
	
	@Column(length = 50)
	private String approver;
	
	@Column(length = 2000)
	private String comment;
	
	@Column(name = "approvedt")
	private LocalDateTime approveDate;
	
	/**
	 * 상태: 미승인(1), 승인(2), 반려(3)
	 */
	@Column(length = 1)
	private String state;
	
}
