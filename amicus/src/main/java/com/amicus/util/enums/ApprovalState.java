package com.amicus.util.enums;

/**
 * 결재상태
 * @author socoolheeya
 * @since 2018.08.17
 */
public enum ApprovalState {
	
	ONGOING("진행중", 1),
	END("종료", 2),
	REJECT("반려", 3);
	
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
