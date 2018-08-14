package com.amicus.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.amicus.common.model.Code;
import com.amicus.common.repository.CodeRepository;

/**
 * 
 * @author socoolheeya
 * @since 2018.08.12
 */

@Service
public class CodeService {
	
	@Autowired
	private CodeRepository codeRepository;
	
	public List<Code> getCodeList(Code code) {
		return codeRepository.getCodeList(code);
	}
	
	public Code getCode(Code code) {
		return codeRepository.getCode(code);
	}
	
	public boolean hasCode(Code code) {
		Code dbCode = codeRepository.getCode(code);
		if(ObjectUtils.isEmpty(dbCode)) {
			return false; 
		} else {
			return true;
		}
	}
}
