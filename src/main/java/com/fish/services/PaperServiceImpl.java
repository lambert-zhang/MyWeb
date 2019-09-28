package com.fish.services;

import org.springframework.stereotype.Service;

import com.fish.modules.Paper;
import com.fish.services.PaperService;

@Service
public class PaperServiceImpl implements PaperService {
	
	public final Paper getPaper() {
		Paper paper = new Paper();
		paper.setPages(5);
		paper.setPrice(123);
		paper.setQuaility("good!");
		return paper;
	}

}
