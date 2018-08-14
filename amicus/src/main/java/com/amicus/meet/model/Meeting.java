package com.amicus.meet.model;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 회의
 * @author socoolheeya
 * @since 2018.08.13
 */
@Entity
@Table(name = "t_meeting")
public class Meeting {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(length = 500)
	private String title;
	
	@Column(length = 50)
	private String organiser;
	
	@Column(name = "meeting_day")
	private Date meetingDay;
	
	@Column(name = "starttime")
	private LocalDateTime startTime;
	
	@Column(name = "endtime")
	private LocalDateTime endTime;
	
	@Column(name = "createdt")
	private LocalDateTime createDate;

	@Column(length = 50)
	private String creater;

	@Column(name = "updatedt")
	private LocalDateTime updateDate;

	@Column(length = 50)
	private String updater;
	
	@OneToOne
	@JoinColumn(name = "room_id")
	private MeetingRoom meetingRoom;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "meeting_id")
	private List<MeetingPerson> meetingPersons;
}
