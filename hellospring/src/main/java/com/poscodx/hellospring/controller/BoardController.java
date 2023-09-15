package com.poscodx.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {
	@ResponseBody
	@RequestMapping("/board/write")
	public String view(Long no) {
		return "BoardController.view(" + no + ")";
	}

	@ResponseBody
	@RequestMapping("/board/view/{no}")
	public String view1(@PathVariable("no") Long no) {
		return "BoardController.view(" + no + ")";
	}
	
	@ResponseBody
	@RequestMapping("/board/view/")
	public String view2(Long no) {
		return "BoardController.view(" + no + ")";
	}
}
