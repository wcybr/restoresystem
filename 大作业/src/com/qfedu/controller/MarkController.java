package com.qfedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.qfedu.pojo.Mark;
import com.qfedu.service.MarkService;

@Controller("MarkController")
public class MarkController {
	@Autowired
	private MarkService markService;
	
	@RequestMapping(value = "/markadd", method = RequestMethod.POST)
	public String add(Mark mark) {
		if (markService.register(mark) > 0) {
			return "teachermain";}
		else {
			return "markadd";
		}
		
	}
	@RequestMapping(value = "/markadd1", method = RequestMethod.POST)
	public String add1(Mark mark) {
		if (markService.register(mark) > 0) {
			return "studentselect";}
		else {
			return "studentclassaadd";
		}
		
	}
	@RequestMapping(value="/markall",method=RequestMethod.GET)
	public String all(Model model) {
		model.addAttribute("mark", markService.queryAll());
		return "markteachermap";
	}
	@RequestMapping(value="/markall2",method=RequestMethod.GET)
	public String all2(Model model) {
		model.addAttribute("mark2", markService.queryAll());
		return "markstudentmap";
	}
	@RequestMapping(value="/markdelete",method=RequestMethod.GET)
	public String  del(Mark mark){
		markService.del(mark);
		return "teachermain";
		
	}
	@RequestMapping(value="/markupda",method=RequestMethod.POST)
	public String  update(Mark mark){
		markService.update(mark);
		return "teachermain";
		
	}
	@RequestMapping(value="/markfindOne",method=RequestMethod.POST)
	public String Jump(Mark mark,Model model){
model.addAttribute("mark", markService.findOne(mark));
	    	return "markteachermap";
	   
	}
	@RequestMapping(value="/markfindOne2",method=RequestMethod.POST)
	public String Jump2(Mark mark,Model model){
 model.addAttribute("mark2", markService.findOne(mark));
	    	return "markstudentmap";
	  
	}

}