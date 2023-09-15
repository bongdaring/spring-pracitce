package com.poscodx.emaillist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.poscodx.emaillist.repository.EmaillistRepository;
import com.poscodx.emaillist.vo.EmaillistVo;

@Controller
public class EmaillistController  {
	@Autowired
	private EmaillistRepository emaillistRepository;
	
	@ResponseBody
	@RequestMapping("/")
	public String main() {
//		emaillistRepository.findAll();
		return "ok!";
	}

}
