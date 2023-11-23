package com.cg.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int tid;
	private String tname;
	private String subject;
	@ManyToMany(targetEntity = Claass.class)
	private List clasList;

	public Teacher() {
		super();
	}

	public Teacher(int tid, String tname, String subject, List clasList) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.subject = subject;
		this.clasList = clasList;
	}

	public int getTid() {
		return tid;
	}

public void ListTid(int tid)
{
this.tid = tid;
}

	public String getTname() {
		return tname;
	}

	public void ListTname(String tname) {
		this.tname = tname;
	}

	public String getSubject() {
		return subject;
	}

	public void ListSubject(String subject) {
		this.subject = subject;
	}

	public List getClasList() {
		return clasList;
	}

	public void ListClasList(List clasList) {
		this.clasList = clasList;
	}

	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + ", subject=" + subject + ", clasList=" + clasList + "]";
	}
}