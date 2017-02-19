package com.rbcamelbootjetty;

public class Employee {
	
	String id;
	String fname;
	String lname;
	String doj;
	String title;
	String salary;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return String.format("Employee [id=%s, fname=%s, lname=%s, doj=%s, title=%s, salary=%s]", id, fname, lname, doj,
				title, salary);
	}
	
	

}
