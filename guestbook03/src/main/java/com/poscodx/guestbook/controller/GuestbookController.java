package com.poscodx.guestbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.poscodx.guestbook.repository.GuestBookRepository;
import com.poscodx.guestbook.vo.GuestBookVo;

@Controller
public class GuestbookController {
	@Autowired
	private GuestBookRepository guestBookRepository;

	@RequestMapping("/")
	public String main(Model model) {
		List<GuestBookVo> list = guestBookRepository.findAll();
		model.addAttribute("list", list);
		return "index";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(GuestBookVo vo) {
		guestBookRepository.insert(vo);
		return "redirect:/";
	}
	
	@RequestMapping(value = "/delete/{no}", method = RequestMethod.GET)
	public String delete(@PathVariable("no") Long no, Model model) {
		model.addAttribute("no", no);
		return "delete";
	}
	
	@RequestMapping(value = "/delete/{no}", method = RequestMethod.POST)
	public String delete(@PathVariable(value="no", required=true) int no, String password) {
		GuestBookVo vo = guestBookRepository.findByNo(no);
		if(vo.getPassword().equals(password)) {
			guestBookRepository.deleteByNo(no);			
		}
		return "redirect:/";
	}


}
