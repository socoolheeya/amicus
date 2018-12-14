package com.amicus.meet.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amicus.util.enums.WbsState;
import com.amicus.util.enums.mapper.EnumMapper;

@Controller
@RequestMapping("/meet")
public class MeetController {
	
	@Bean
	public EnumMapper enumMapper() {
		EnumMapper eumMapper = new EnumMapper();
		eumMapper.put("WbsType", WbsState.class);

		return eumMapper;
	}
	
	@GetMapping(value="/meetingList")
	public String meetList(Model model) {
		enumMapper().get("");
		return "meet/meetingList";
	}
	
	
}
