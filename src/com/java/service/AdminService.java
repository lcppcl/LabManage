package com.java.service;

import java.util.List;

import com.java.entity.User;

public interface AdminService {
	// �����ʦ
	public Integer addTeacher(User user);

	// �鿴������ʦ
	public List<User> getAllTeacher(String status);

	// ����idɾ����ʦ
	public int deleteById(Integer id);
}
