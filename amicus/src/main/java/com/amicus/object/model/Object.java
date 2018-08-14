package com.amicus.object.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 객체
 * 
 * @author user
 * @since 2018.08.13
 */
@Entity
@Table(name = "t_object")
public class Object {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	@Column(name = "wbs_id")
	private Long wbsId;

	@Column(name = "createdt")
	private LocalDateTime createDate;

	@Column(length = 50)
	private String creater;

	@Column(name = "updatedt")
	private LocalDateTime updateDate;

	@Column(length = 50)
	private String updater;

}
