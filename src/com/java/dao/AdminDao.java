package com.java.dao;

import java.util.List;

import com.java.entity.User;

public interface AdminDao {
	//�����ʦ
	public Integer addTeacher(User user);
	//�鿴������ʦ
	public List<User> getAllTeacher(String status);
}
