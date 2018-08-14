package com.amicus.meet.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 회의실 정보
 * @author socoolheeya
 * @since 2018.08.13
 */
@Entity
@Table(name = "t_meeting_room")
public class MeetingRoom {
	
	@Id
	@Column(name = "room_id")
	private String id;
	
	@Column(length = 1000)
	private String name;
	
	@Column(length = 10)
	private String floor;
	
	@Column(length = 4000)
	private String description;
	
	@Column(name = "use_yn", length = 1)
	private String useYn;
	
	@Column(name = "createdt")
	private LocalDateTime createDate;

	@Column(length = 50)
	private String creater;

	@Column(name = "updatedt")
	private LocalDateTime updateDate;

	@Column(length = 50)
	private String updater;
	
}
