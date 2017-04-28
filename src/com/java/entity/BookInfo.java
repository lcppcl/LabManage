package com.java.entity;

import java.io.Serializable;

public class BookInfo implements Serializable{
	public Integer id;
	public String labNumber;//ʵ��������
	public String circumstance;//�ڼ���
	public String week;//�ܼ�
	public String lesson;//�ڼ���
	public String teacher;//��ʦ
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getLabNumber() {
		return labNumber;
	}
	public void setLabNumber(String labNumber) {
		this.labNumber = labNumber;
	}
	public String getCircumstance() {
		return circumstance;
	}
	public void setCircumstance(String circumstance) {
		this.circumstance = circumstance;
	}
	public String getWeek() {
		return week;
	}
	public void setWeek(String week) {
		this.week = week;
	}
	public String getLesson() {
		return lesson;
	}
	public void setLesson(String lesson) {
		this.lesson = lesson;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	@Override
	public String toString() {
		return "BookInfo [id=" + id + ", labNumber=" + labNumber
				+ ", circumstance=" + circumstance + ", week=" + week
				+ ", lesson=" + lesson + ", teacher=" + teacher + "]";
	}
	
}
