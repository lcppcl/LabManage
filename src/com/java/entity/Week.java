package com.java.entity;

import java.io.Serializable;

public class Week implements Serializable {
	public Integer category;
	public String name; // ��һ������

	public Integer getCategory() {
		return category;
	}

	public void setCategory(Integer category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
