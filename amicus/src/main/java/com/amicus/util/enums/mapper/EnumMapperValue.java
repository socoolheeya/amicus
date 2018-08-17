package com.amicus.util.enums.mapper;

/**
 * 
 * @author socoolheeya
 * @since 2018.08.18
 */
public class EnumMapperValue {
	
	private String name;
	private int code;
	
	public EnumMapperValue(EnumMapperType type) {
		name = type.getName();
		code = type.getCode();
	}
	
	public String getName() {
		return name;
	}
	
	public int getCode() {
		return code;
	}
	
	@Override
	public String toString() {
		return "name : " + name + ", code : " + code;
	}
}
