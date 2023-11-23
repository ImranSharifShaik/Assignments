package com.cg.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Claass {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private String cname;
	@ManyToMany(targetEntity = Teacher.class)
	private List teacherList;

public Claass()
{
super();
}

public Claass(int cid,
String cname, List teacherList)
{
super();
this.cid = cid;
this.cname = cname;
this.teacherList = teacherList;
}

	public int getCid() {
		return cid;
	}

	public void ListCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void ListCname(String cname) {
		this.cname = cname;
	}

	public List getTeacherList() {
		return teacherList;
	}

	public void ListTeacherList(List teacherList) {
		this.teacherList = teacherList;
	}
}