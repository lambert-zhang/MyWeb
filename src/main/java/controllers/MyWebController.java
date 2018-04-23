package controllers;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import modules.Paper;
import services.PaperService;
//import services.PaperServiceImpl;

@RestController
public class MyWebController {

	@Resource(name = "paperServiceImpl")
	private PaperService paperService;


	@RequestMapping(value = {"/lambert", "/"})
	public @ResponseBody Paper getPaper() throws JsonProcessingException {
//		return "my web example with spring !";
//		return PaperServiceImpl.getPaper();
		
		Paper paper = paperService.getPaper();
		
		ObjectMapper mapper = new ObjectMapper();
		System.out.println("=====>");
		System.out.println(mapper.writeValueAsString(paper));
		return paper;
	}

}
