package com.jspiders.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jspiders.springmvc.pojo.StudentPOJO;
import com.jspiders.springmvc.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService service;

	//Home controller
	@GetMapping("/home")
	public String home() {
		return "Home";
	}

	//Add form controller
	@GetMapping("/add")
	public String addPage() {
		return "AddStudent";
	}
	
	//Add data controller
	@PostMapping("/add")
	public String addStudent(@RequestParam String name,
								@RequestParam String email,
								@RequestParam long mobile,
								@RequestParam String address,
								ModelMap map) {
		StudentPOJO pojo = service.addStudent
				(name, email, mobile, address);
		//Success
		if (pojo != null) {
			map.addAttribute("msg", "Data inserted successfully. ");
			return "AddStudent";
		}
		//Failure
		map.addAttribute("msg", "Data not inserted. ");
		return "AddStudent";
	}

	//Search Page controller
	@GetMapping("/search")
	public String searchPage() {
		return "SearchStudent";
	}
	
	//Search Data controller
	@PostMapping("/search")
	public String searchStudent(@RequestParam int id,
									ModelMap map) {
		StudentPOJO pojo = service.searchStudent(id);
		//Success
		if (pojo != null) {
			map.addAttribute("student", pojo);
			map.addAttribute("msg", "Student record found. ");
			return "SearchStudent";
		}
		//Failure
		map.addAttribute("msg", "Student data does not exist. ");
		return "SearchStudent";
	}

	@GetMapping("/update")
	public String updatePage() {
		return "UpdateStudent";
	}

	@GetMapping("/remove")
	public String removePage() {
		return "RemoveStudent";
	}

}
