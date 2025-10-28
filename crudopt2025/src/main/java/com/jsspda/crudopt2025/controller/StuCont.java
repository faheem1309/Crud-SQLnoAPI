package com.jsspda.crudopt2025.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jsspda.crudopt2025.model.Student;
import com.jsspda.crudopt2025.repository.StuRepo;

@Controller
public class StuCont {
	
	@Autowired
	StuRepo sturepo;
	
	@RequestMapping("index")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("addStu")
	public String addStu(Student student) {
		sturepo.save(student);
		return "index.jsp";
	}
	
	@RequestMapping("getStu")
	public ModelAndView getStu(@RequestParam int sid) {
		ModelAndView mv = new ModelAndView("display.jsp");
		Student student =  sturepo.findById(sid).orElse(new Student());
		mv.addObject(student);
		return mv;
	}
	
	@RequestMapping("delStu")
	public ModelAndView delStu(@RequestParam int sid) {
		ModelAndView mv = new ModelAndView("delete.jsp");
		Student student =  sturepo.findById(sid).orElse(new Student());
		sturepo.deleteById(sid);
		mv.addObject(student);
		return mv;
	}
	
	@RequestMapping("updStu")
	public ModelAndView updStu(Student student) {
		ModelAndView mv = new ModelAndView("update.jsp");
		student =  sturepo.findById(student.getSid()).orElse(new Student());
		mv.addObject(student);
		return mv;
	}

}
