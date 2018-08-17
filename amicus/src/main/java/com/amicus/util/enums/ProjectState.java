package com.amicus.util.enums;

/**
 * 프로젝트 진행상태
 * @author socoolheeya
 * @since 2018.08.12
 */
public enum ProjectState {
	NOT_START("미도래", 1),
	ONGOING("진행중", 2),
	END("종료", 3);
	
	private String name;
	private int value;
	
	ProjectState(String name, int value) {
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
