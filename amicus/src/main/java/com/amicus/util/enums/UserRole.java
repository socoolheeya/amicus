package com.amicus.util.enums;

import com.amicus.util.enums.mapper.EnumMapperType;

/**
 * 사용자권한
 * @author socoolheeya
 * @since 2018.08.12
 */
public enum UserRole implements EnumMapperType {
	
	SUPER("최고관리자", 1),
	ADMIN("관리자", 2),
	USER("사용자", 3),
	TESTER("테스터", 4);
	
	private String name;
	private int code;
	
	UserRole(String name, int code) {
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
