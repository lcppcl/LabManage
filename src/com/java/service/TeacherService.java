package com.java.service;

import java.util.List;

import com.java.entity.Lab;
import com.java.entity.User;

public interface TeacherService {
	// ����id������ʦ
	public int updateById(User user);

	// ����id����
	public User findById(Integer id);
	
	//������ʦid���ҹ���ʵ����
	public List<Lab> findByUserNumber(String userNumber);
}
