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
	@Column(name = "meeting_id")
	private long meetingId;
	
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
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "room_id")
	private MeetingRoom meetingRoom;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "participant_id")
	private List<MeetingPerson> meetingPersons;

	public long getMeetingId() {
		return meetingId;
	}

	public void setMeetingId(long meetingId) {
		this.meetingId = meetingId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOrganiser() {
		return organiser;
	}

	public void setOrganiser(String organiser) {
		this.organiser = organiser;
	}

	public Date getMeetingDay() {
		return meetingDay;
	}

	public void setMeetingDay(Date meetingDay) {
		this.meetingDay = meetingDay;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
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

	public MeetingRoom getMeetingRoom() {
		return meetingRoom;
	}

	public void setMeetingRoom(MeetingRoom meetingRoom) {
		this.meetingRoom = meetingRoom;
	}

	public List<MeetingPerson> getMeetingPersons() {
		return meetingPersons;
	}

	public void setMeetingPersons(List<MeetingPerson> meetingPersons) {
		this.meetingPersons = meetingPersons;
	}
}
