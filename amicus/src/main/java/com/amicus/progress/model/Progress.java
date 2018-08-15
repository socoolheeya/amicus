package com.amicus.progress.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 진척관리
 * @author socoolheeya
 * @since 2018.08.12
 */
@Entity
@Table(name = "t_progress")
public class Progress {
	
	@Id
	@Column(name = "wbs_id")
	private long wbsId;
	
	@Column(name = "plan_rate")
	private double planRate;
	
	@Column(name = "real_rate")
	private double realRate;
	
	@Column(name = "takedays")
	private int takeDays;
	
	@Column(name = "progressdt")
	private LocalDateTime progressDate;
	
	
}
