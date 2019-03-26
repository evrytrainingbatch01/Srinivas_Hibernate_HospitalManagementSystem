package com.evry.model;

public class Patient {
private int id;
private String pname;
private int age;
private String Bgroup;
private String checkup;
private String doctors;
private String testcase;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getBgroup() {
	return Bgroup;
}
public void setBgroup(String bgroup) {
	Bgroup = bgroup;
}
public String getCheckup() {
	return checkup;
}
public void setCheckup(String checkup) {
	this.checkup = checkup;
}
public String getDoctors() {
	return doctors;
}
public void setDoctors(String doctors) {
	this.doctors = doctors;
}
public String getTestcase() {
	return testcase;
}
public void setTestcase(String testcase) {
	this.testcase = testcase;
}

}
