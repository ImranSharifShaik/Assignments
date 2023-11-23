package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Teacher;
import com.cg.service.SchoolService;

@RestController
public class SchoolController {
	
	@Autowired
	private  SchoolService schoolService;

	   @PostMapping("/add")
	   public String addSchool(@RequestBody Teacher t) {
		      
		   return schoolService.addTeacher(t);
		   
	   }
	   
	   @GetMapping("/get")
	   public List<Teacher> getAllTeacher()
	   {
		   return schoolService.getAllTeacher();
	   }
	   
	  

	 
}
