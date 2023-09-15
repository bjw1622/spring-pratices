package com.poscodx.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/user")
@Controller
public class UserController {
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String joinform() {
		return "/WEB-INF/views/joinform.jsp";
	}

	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(UserVo vo) {
		System.out.println("UserController.join(): UserDao.insert....(" + vo + ")");
		return "redirect:/";
	}

	@ResponseBody
	@RequestMapping("/update")
	public String update(@RequestParam("name") String name) {
		// 만일 n이라는 이름의 url 파라미터가 없으면
		// 400 bad request에러가난다.
		return "UserController.update(" + name + ")";
	}

	@ResponseBody
	@RequestMapping("/update2")
	public String update2(@RequestParam(value = "n", required = true, defaultValue = "") String name) {
		if (name == null) {
			name = "";
		}
		return "UserController.update(" + name + ")";
	}

	@ResponseBody
	@RequestMapping("/list")
	public String update3(@RequestParam(value = "p", required = true, defaultValue = "1") int pageNo) {
		return "UserController.update(" + pageNo + ")";
	}
}
