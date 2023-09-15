package com.poscodx.emaillist.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.poscodx.emaillist.repository.EmaillistRepository;
import com.poscodx.emaillist.vo.EmaillistVo;

@Controller
public class EmaillistController  {
	@Autowired
	private EmaillistRepository emaillistRepository;
	
	@RequestMapping("/")
	public String main(Model model) {
		List<EmaillistVo> list = emaillistRepository.findAll();
		model.addAttribute("list",list);
		return "main";
	}
	
	@RequestMapping(value="/add", method = RequestMethod.GET)
	public String add() {
		return "add";
	}
	
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public String add(HttpServletRequest request, EmaillistVo vo) {
//		request.setCharacterEncoding("utf-8");
		
		emaillistRepository.insert(vo);
		return "redirect:/";
	}

	
}
