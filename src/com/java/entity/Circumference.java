package com.java.entity;

import java.io.Serializable;

public class Circumference implements Serializable {
	public Integer week;
	public String name;//��һ�ܵ���11��
	
	public Integer getWeek() {
		return week;
	}
	public void setWeek(Integer week) {
		this.week = week;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
