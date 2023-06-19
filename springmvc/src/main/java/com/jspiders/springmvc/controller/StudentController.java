package com.jspiders.springmvc.controller;

import java.util.List;

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

	// Home controller
	@GetMapping("/home")
	public String home() {
		return "Home";
	}

	// Add form controller
	@GetMapping("/add")
	public String addPage() {
		return "AddStudent";
	}

	// Add data controller
	@PostMapping("/add")
	public String addStudent(@RequestParam String name, @RequestParam String email, @RequestParam long mobile,
			@RequestParam String address, ModelMap map) {
		StudentPOJO pojo = service.addStudent(name, email, mobile, address);
		// Success
		if (pojo != null) {
			map.addAttribute("msg", "Data inserted successfully. ");
			return "AddStudent";
		}
		// Failure
		map.addAttribute("msg", "Data not inserted. ");
		return "AddStudent";
	}

	// Search Page controller
	@GetMapping("/search")
	public String searchPage() {
		return "SearchStudent";
	}

	// Search Data controller
	@PostMapping("/search")
	public String searchStudent(@RequestParam int id, ModelMap map) {
		StudentPOJO pojo = service.searchStudent(id);
		// Success
		if (pojo != null) {
			map.addAttribute("student", pojo);
			map.addAttribute("msg", "Student record found. ");
			return "SearchStudent";
		}
		// Failure
		map.addAttribute("msg", "Student data does not exist. ");
		return "SearchStudent";
	}

	// Remove page controller
	@GetMapping("/remove")
	public String removePage(ModelMap map) {
		List<StudentPOJO> students = service.allStudents();
		map.addAttribute("students", students);
		return "RemoveStudent";
	}

	// Remove data controller
	@PostMapping("/remove")
	public String removeStudent(@RequestParam int id, ModelMap map) {
		StudentPOJO pojo = service.removeStudent(id);
		// Success
		if (pojo != null) {
			List<StudentPOJO> students = service.allStudents();
			map.addAttribute("students", students);
			map.addAttribute("msg", "Student data removed successfully. ");
			return "RemoveStudent";
		}
		// Failure
		List<StudentPOJO> students = service.allStudents();
		map.addAttribute("students", students);
		map.addAttribute("msg", "Student data does not exist. ");
		return "RemoveStudent";
	}
	
	//Update page controller
	@GetMapping("/update")
	public String updatePage(ModelMap map) {
		List<StudentPOJO> students = service.allStudents();
		map.addAttribute("students", students);
		return "UpdateStudent";
	}
	
	//Update view controller
	@PostMapping("/update")
	public String updateForm(@RequestParam int id,
								ModelMap map) {
		StudentPOJO pojo = service.searchStudent(id);
		// Success
		if (pojo != null) {
			map.addAttribute("student", pojo);
			return "UpdateStudent";
		}
		// Failure
		map.addAttribute("msg", "Student data does not exist. ");
		List<StudentPOJO> students = service.allStudents();
		map.addAttribute("students", students);
		return "UpdateStudent";
	}
	
	//Update data controller
	@PostMapping("/updateData")
	public String updateStudent(@RequestParam int id,
									@RequestParam String name,
									@RequestParam String email,
									@RequestParam long mobile,
									@RequestParam String address,
									ModelMap map) {
		StudentPOJO pojo = 
				service.updateStudent(id, name, email, mobile, address);
		//Success
		if (pojo != null) {
			map.addAttribute("msg", "Student data updated. ");
			List<StudentPOJO> students = service.allStudents();
			map.addAttribute("students", students);
			return "UpdateStudent";
		}
		//Failure
		map.addAttribute("msg", "Student data not updated. ");
		List<StudentPOJO> students = service.allStudents();
		map.addAttribute("students", students);
		return "UpdateStudent";
	}

}
