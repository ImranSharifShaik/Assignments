package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.Claass;
import com.cg.entity.Teacher;
import com.cg.repository.ClaassRepository;
import com.cg.repository.TeacherRepository;


@Service
public class SchoolService{

	@Autowired
	private TeacherRepository teacherRepo;
	
	@Autowired
	private ClaassRepository classRepo;
	

	public String addTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		
	
		teacherRepo.save(teacher);
		return "teacher Saved";
	}

	public List<Teacher> getAllTeacher() {
		return teacherRepo.findAll();
		 
	}


}
