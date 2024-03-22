package com.qfedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.qfedu.pojo.Teacher;
import com.qfedu.service.TeacherService;

@Controller("TeacherController")
public class TeacherController {
	@Autowired
	private TeacherService teacherService;

	@RequestMapping(value = "/teacheradd", method = RequestMethod.POST)
	public String add(Teacher teacher, Model model) {
		if (teacherService.register(teacher) > 0) {
			model.addAttribute("msg", "注册成功，请登录！");
			return "teacherlogin";
		} else {
			model.addAttribute("msg", "服务器异常，新增学生信息失败！");
			return "teacheradd";
		}
	}

	@RequestMapping(value = "/teacherlogin", method = RequestMethod.POST)
	public String login(Teacher teacher, Model model) {
		if (teacherService.login(teacher)) {
			model.addAttribute("tname", teacher.getTname());
			return "teachermain";
		} else {
			model.addAttribute("msg", "账号或密码错误，请重新输入！");
			return "teacherlogin";
		}
	}
	@RequestMapping(value="/teacherall",method=RequestMethod.GET)
	public String all(Model model) {
		model.addAttribute("teacher", teacherService.queryAll());
		return "teachermap";
	}
	@RequestMapping(value="/teacherall1",method=RequestMethod.GET)
	public String all1(Model model) {
		model.addAttribute("teacher", teacherService.queryAll());
		return "studentselect";
	}
	@RequestMapping(value="/teacherdelete",method=RequestMethod.GET)
	public String  del(String  tsid){
		teacherService.del(tsid);
		return "teachermap";
		
	}
	@RequestMapping(value="/teacherupda",method=RequestMethod.POST)
	public String  update(Teacher teacher){
		teacherService.update(teacher);
		return "teachermain";
		
	}
	@RequestMapping(value="/teacherfindOne",method=RequestMethod.POST)
	public String Jump(Teacher teacher,Model model){
	    if(teacher!=null){
	  model.addAttribute("teacher", teacherService.findOne(teacher));
	    	return "teachermap";
	    }
		return "teacherall";
		
	}
	@RequestMapping(value="/teacherfindOne1",method=RequestMethod.GET)
	public String Jump1(Teacher teacher,Model model){
	    if(teacher!=null){
	  model.addAttribute("tsid", teacher.getTsid());
	    	return "studentclassadd";
	    }
		return "teachermap";
		
	}
	@RequestMapping(value="/teacherfindOne2",method=RequestMethod.POST)
	public String Jump2(Teacher teacher,Model model){
	    if(teacher!=null){
	  model.addAttribute("teacher", teacherService.findOne(teacher));
	    	return "studentselect";
	    }
		return "teachermap";
		
	}
}