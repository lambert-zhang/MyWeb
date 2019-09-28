package com.fish.controllers;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.fish.modules.Paper;
import com.fish.services.PaperService;

@RestController
//@Controller
public class MyWebController {

	@Resource(name = "paperServiceImpl")
	private PaperService paperService;


	@RequestMapping(value = {"/lambert"})
	public Paper getPaper() {
//		return "my web example with spring !";
//		return PaperServiceImpl.getPaper();
		
		Paper paper = paperService.getPaper();
		
		System.out.println("=====>");
		System.out.println(JSONObject.toJSONString(paper));
		return paper;
	}

}
