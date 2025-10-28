package com.example.yesh1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.yesh1.model.Employee;
import com.example.yesh1.repository.EmpRepo;

@Controller
public class EmpCont {
	@Autowired
	EmpRepo emprepo;
	
	@RequestMapping("index")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("addEmp")
	public String addEmp(Employee employee) {
		emprepo.save(employee);
		return "index.jsp";
	}
	
	@RequestMapping("getEmp")
	public ModelAndView getStu(@RequestParam int eid) {
		ModelAndView mv = new ModelAndView("display.jsp");
		Employee employee =  emprepo.findById(eid).orElse(new Employee());
		mv.addObject(employee);
		return mv;
	}
	

	@RequestMapping("delEmp")
	public ModelAndView delEmp(@RequestParam int eid) {
		ModelAndView mv = new ModelAndView("delete.jsp");
		Employee employee =  emprepo.findById(eid).orElse(new Employee());
		emprepo.deleteById(eid);
		mv.addObject(employee);
		return mv;
	}
	
	@RequestMapping("updEmp")
	public ModelAndView updStu(Employee employee) {
		ModelAndView mv = new ModelAndView("update.jsp");
		employee =  emprepo.findById(employee.getEid()).orElse(new Employee());
		mv.addObject(employee);
		return mv;
	}
}