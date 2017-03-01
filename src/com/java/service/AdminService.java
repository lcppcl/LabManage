package com.java.service;

import java.util.List;

import com.java.entity.User;

public interface AdminService {
	// 添加老师
	public Integer addTeacher(User user);

	// 查看所有老师
	public List<User> getAllTeacher(String status);

	// 根据id删除老师
	public int deleteById(Integer id);
}
