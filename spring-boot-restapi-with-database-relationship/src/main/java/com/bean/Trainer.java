package com.bean;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Trainer {
@Id
private int tid;
private String tech;
private String tname;

@JoinColumn(name="tsid")
@OneToMany
private List<Student> listofstudent;

public int getTid() {
	return tid;
}

public void setTid(int tid) {
	this.tid = tid;
}

public String getTech() {
	return tech;
}

public void setTech(String tech) {
	this.tech = tech;
}

public String getTname() {
	return tname;
}

public void setTname(String tname) {
	this.tname = tname;
}

public List<Student> getListofstudent() {
	return listofstudent;
}

public void setListofstudent(List<Student> listofstudent) {
	this.listofstudent = listofstudent;
}


}
