package controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class MyWebController {
	
	@RequestMapping(value = {"/lambert", "/"})
	@ResponseBody
	public String getInfo() {
		return "my web example!";
	}

}
