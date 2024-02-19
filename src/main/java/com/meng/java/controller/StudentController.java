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
	@RequestMapping(value =  "/show2/{name}")
	public String displayStudnetV2(Model model , @PathVariable("name") String studentName) {
		model.addAttribute("Name", studentName);
		model.addAttribute("gender", "Male");
		model.addAttribute("Address", "pp");
		return "show-single-student"; //view name
	}
	
	@RequestMapping(value =  "/show3")
	public String displayStudnetV3(Model model , @RequestParam("gender") String gender ) {
		model.addAttribute("Name", "Meng");
		model.addAttribute("gender", gender);
		model.addAttribute("Address", "pp");
		return "show-single-student"; //view name
	}
	
	@RequestMapping(value =  "/show4")
	public String displayStudnetV4(Model model , @RequestParam Map<String, String> params) {
		
		String name = params.get("name");
		String g = params.get("gender");
		String address = params.get("address");
		
		model.addAttribute("Name", name);
		model.addAttribute("gender", g);
		model.addAttribute("Address", address);
		return "show-single-student"; //view name
	}
}
