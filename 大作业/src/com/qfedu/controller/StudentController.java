package com.qfedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.qfedu.pojo.Student;
import com.qfedu.service.StudentService;

@Controller("StudentController")
public class StudentController {
	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/studentadd", method = RequestMethod.POST)
	public String add(Student student, Model model) {
		if (studentService.register(student) > 0) {
			model.addAttribute("msg", "注册成功，请登录！");
			return "studentlogin";
		} else {
			model.addAttribute("msg", "服务器异常，新增学生信息失败！");
			return "studentadd";
		}
	}

	@RequestMapping(value = "/studentlogin", method = RequestMethod.POST)
	public String login(Student student, Model model) {
		if (studentService.login(student)) {
			model.addAttribute("sname", student.getSname());
			return "main";
		} else {
			model.addAttribute("msg", "账号或密码错误，请重新输入！");
			return "studentlogin";
		}
	}
	@RequestMapping(value="/studentall",method=RequestMethod.GET)
	public String all(Model model) {
		model.addAttribute("student", studentService.queryAll());
		return "studentmap";
	}
	@RequestMapping(value="/studentdelete",method=RequestMethod.GET)
	public String  del(String  number){
		studentService.del(number);
		return "studentmap";
		
	}
	@RequestMapping(value="/studentupda",method=RequestMethod.POST)
	public String  update(Student student){
		studentService.update(student);
		return "main";
		
	}
	@RequestMapping(value="/studentfindOne",method=RequestMethod.POST)
	public String Jump(Student student,Model model){
	    if(student!=null){
	  model.addAttribute("student", studentService.findOne(student));
	    	return "studentmap";
	    }
		return "studentall";
		
	}

}