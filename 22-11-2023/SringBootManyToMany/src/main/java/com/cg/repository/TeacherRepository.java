package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher,Integer> {

}
