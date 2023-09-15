package com.poscodx.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user")
@Controller
public class UserController {
	@RequestMapping("/joinform")
	public String joinform() {
		return "/WEB-INF/views/joinform.jsp";
	}
}
