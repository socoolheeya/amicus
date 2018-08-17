package com.amicus.util.enums;

/**
 * WBS상태
 * @author socoolheeya
 * @since 2018.08.12
 */
public enum WbsState {
	NOT_START("미도래", 1),
	ONGOING("진행중", 2),
	END("종료", 3);
	
	private String name;
	private int value;
	
	WbsState(String name, int value) {
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
