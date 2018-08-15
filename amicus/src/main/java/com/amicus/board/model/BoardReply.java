package com.amicus.board.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 답글
 * @author socoolheeya
 * @since 2018.08.14
 */
@Entity
@Table(name = "t_board_reply")
public class BoardReply {
	
	@Id
	@GeneratedValue
	@Column(name = "reply_id")
	private Long replyId;
	
	@Column(name = "board_id")
	private Long boardId;
	
	@Column(length = 4000)
	private String content;
	
	@Column(name = "createdt")
	private LocalDateTime createDate;

	@Column(length = 50)
	private String creater;

}
