package com.amicus.util.enums;

/**
 * 객체구분
 * @author socoolheeya
 * @since 2018.08.13
 */
public enum ObjectDivision {
	UI_PLAN("UI설계서", 1),
	COMPONENT_PLAN("컴포넌트설계서", 2),
	INTERFACE_PLAN("인터페이스설계서", 3),
	BATCH_PLAN("배치설계서", 4),
	REPORT_PLAN("보고서설계서", 5),
	PHYSICLAL_DATA("물리데이터", 6),
	TABLE_MAPPING("테이블매핑", 7),
	PROGRAM("프로그램", 8),
	UI("화면", 9);
	
	private String name;
	private int value;
	
	ObjectDivision(String name, int value) {
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
