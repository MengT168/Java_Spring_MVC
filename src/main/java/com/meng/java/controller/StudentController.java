package com.meng.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value =  "/students/")
public class StudentController {
	
	
	@RequestMapping(value =  "/list")
	public String listStudent(Model model) {
		model.addAttribute("welcomeText", "Hello Spring mvc1");
		return "students"; //view name
	}
	
	@RequestMapping(value =  "/showOne")
	public String showOne(Model model) {
		model.addAttribute("Name", "Meng");
		model.addAttribute("Gender", "Male");
		model.addAttribute("Address", "pp");
		return "show-single-student"; //view name
	}
}
