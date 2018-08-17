package com.amicus.util.enums;

/**
 * 결재상태
 * @author socoolheeya
 * @since 2018.08.17
 */
public enum ApprovalState {
	
	REGIST("기안", 1),
	ONGOING("진행중", 1),
	APPROVED("승인", 2),
	RETURN("반려", 3),
	CANCEL("취소", 4);
	
	private String name;
	private int value;
	
	ApprovalState(String name, int value) {
		this.name = name;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	
	public int getValue() {
		return value;
	}
}
