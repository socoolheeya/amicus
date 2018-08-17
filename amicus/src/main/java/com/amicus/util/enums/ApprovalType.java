package com.amicus.util.enums;

import com.amicus.util.enums.mapper.EnumMapperType;

/**
 * 결재종류
 * @author socoolheeya
 * @since 2018.08.17
 */
public enum ApprovalType implements EnumMapperType {
	
	PROJECT_REQUEST("프로젝트요청승인", 1),
	PROJECT_COMPLETE("프로젝트완료승인", 2),
	SUB_PROJECT_REQUEST("서브프로젝트요청승인", 3),
	SUB_PROJECT_COMPLETE("서브프로젝트완료승인", 4),
	PLAN_CHAGE("계획변경승인", 5),
	REQUIREMENT_REGIST("요구사항등록승인", 6),
	REQUIREMENT_CHAGE("요구사항변경승인", 7),
	WBS_REGIST("WBS등록승인", 8),
	WBS_CHAGE("WBS변경승인", 9),
	TASK_COMPLETE("공정완료승인", 10);
	
	private String name;
	private int code;
	
	ApprovalType(String name, int code) {
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
