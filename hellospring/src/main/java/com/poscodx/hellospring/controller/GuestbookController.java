package com.poscodx.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * @RequestMapping 클래스 단독 매핑
 *	4.xx에서만 지원
 * */
//@Controller
@RequestMapping("/guestbook/*")
public class GuestbookController {

	@ResponseBody
	@RequestMapping
	public String list() {
		return "GuestBookController";
	}

	@RequestMapping
	public String delete() {
		return "GuestbookCOntroller.list()";
	}
}
