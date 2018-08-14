package com.amicus.board.model;

import java.time.LocalDateTime;
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

/**
 * 게시판
 * @author socoolheeya
 * @since 2018.08.14
 */
@Entity
@Table(name = "t_board")
public class Board {
	
	@Id
	@GeneratedValue
	@Column(name = "board_id")
	private Long boardId;
	
	@Column(name = "upper_board_id")
	private Long upperBoardId;

	@Column(length = 500)
	private String title;
	
	@Column(length = 4000)
	private String content;
	
	@Column(name = "division_id")
	private Long divisionId;
	
	@Column(name = "createdt")
	private LocalDateTime createDate;

	@Column(length = 50)
	private String creater;

	@Column(name = "updatedt")
	private LocalDateTime updateDate;

	@Column(length = 50)
	private String updater;
	
	@OneToMany(fetch=FetchType.EAGER, cascade= CascadeType.ALL)
	@JoinColumn(name = "board_id")
	private List<BoardReply> boardReplies;
	
	@OneToMany(fetch=FetchType.EAGER, cascade= CascadeType.ALL)
	@JoinColumn(name = "board_id")
	private List<BoardFile> boardFiles;
	
	
}
