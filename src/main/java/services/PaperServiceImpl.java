package services;

import modules.Paper;
import services.PaperService;

import org.springframework.stereotype.Service;

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
