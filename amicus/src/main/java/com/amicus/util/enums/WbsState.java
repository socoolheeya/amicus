package com.amicus.util.enums;

import com.amicus.util.enums.mapper.EnumMapperType;

/**
 * WBS상태
 * @author socoolheeya
 * @since 2018.08.12
 */
public enum WbsState implements EnumMapperType {
	
	NOT_START("미도래", 1),
	ONGOING("진행중", 2),
	END("종료", 3);
	
	private String name;
	private int code;
	
	WbsState(String name, int code) {
		this.name = name;
		this.code = code;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public int getCode() {
		return code;
	}
}
