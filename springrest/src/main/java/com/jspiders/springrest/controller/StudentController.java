package com.jspiders.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jspiders.springrest.pojo.StudentPOJO;
import com.jspiders.springrest.response.StudentResponse;
import com.jspiders.springrest.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService service;

	@PostMapping(path = "/add",
				consumes = MediaType.APPLICATION_JSON_VALUE,
				produces =  MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StudentResponse> 
				addStudent(@RequestBody StudentPOJO pojo) {
		StudentPOJO student = service.addStudent(pojo);
		StudentResponse response = new StudentResponse();
		//Success flow
		if (student != null) {
			response.setMessage("Data inserted successfully. ");
			response.setData(student);
			return new ResponseEntity<StudentResponse>
						(response, HttpStatus.ACCEPTED);
		}
		//Failure flow
		response.setMessage("Data not inserted. ");
		return new ResponseEntity<StudentResponse>
						(response, HttpStatus.BAD_REQUEST);

	}
	
	@GetMapping(path = "/search{id}",
				produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StudentResponse> search(@PathVariable int id){
		StudentPOJO student = service.searchStudent(id);
		//Success flow
		if (student != null) {
			return new ResponseEntity<StudentResponse>
						(new StudentResponse("Data found successfully. ",
											student, null), 
							HttpStatus.FOUND);
		}
		//Failure flow
		return new ResponseEntity<StudentResponse>
		(new StudentResponse("Data does not exist. ",
							null, null), 
			HttpStatus.NOT_FOUND);
	}
	
	@GetMapping(path = "/searchAll",
				produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StudentResponse> searchAllStudents() {
		List<StudentPOJO> students = service.searchAllStudents();
		if (students != null) {
			return new ResponseEntity<StudentResponse>
					(new StudentResponse("Data found successfully. ",
									null, students),
							HttpStatus.FOUND);
		}
		return new ResponseEntity<StudentResponse>
		(new StudentResponse("No student data found. ",
						null, null),
				HttpStatus.NOT_FOUND);
	}

}
