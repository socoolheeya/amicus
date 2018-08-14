package com.amicus.cost.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 비용관리
 * @author socoolheeya
 * @since 2018.08.13
 */
@Entity
@Table(name = "t_cost")
public class Cost {
	
	@Id
	@Column(name = "project_id")
	private Long projectId;
	
	@Column(name = "total_cost")
	private int totalCost;
	
	
}
