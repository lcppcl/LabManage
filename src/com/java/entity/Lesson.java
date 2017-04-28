package com.java.entity;

import java.io.Serializable;

public class Lesson implements Serializable {
	public Integer lesson;
	public String name;//一二节到五六节

	public Integer getLesson() {
		return lesson;
	}

	public void setLesson(Integer lesson) {
		this.lesson = lesson;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
