package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customers {
	private int cusid;
	private String cusname;
	private String course;
	@Autowired
	Technologies techDetail;
	public Technologies getTechDetail() {
		return techDetail;
	}
	public void setTechDetail(Technologies techDetail) {
		this.techDetail = techDetail;
	}
	public int getCusid() {
		return cusid;
	}
	public void setCusid(int cusid) {
		this.cusid = cusid;
	}
	public String getCusname() {
		return cusname;
	}
	public void setCusname(String cusname) {
		this.cusname = cusname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public void display() {
		System.out.println("Object returned successfully!!");
		techDetail.tech();
	}
}
