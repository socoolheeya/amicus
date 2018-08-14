package com.amicus.common.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amicus.common.model.Code;
import com.amicus.common.service.CodeService;

@Controller
@RequestMapping("/code")
public class CodeController {
	
	@Autowired
	private CodeService codeService;
	
	@GetMapping(value="/codeList")
	public String codeList(Model model) throws Exception {
		Code code = new Code();
		code.setCategoryId(1);
		codeService.getCodeList(code);
		
		model.addAttribute("codeList", codeService.getCodeList(code));
		
		return "code/codeList";
	}
	
}
