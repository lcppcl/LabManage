package com.java.service;

import java.util.List;

import com.java.entity.Lab;
import com.java.entity.User;

public interface TeacherService {
	// 根据id更新老师
	public int updateById(User user);

	// 根据id查找
	public User findById(Integer id);
	
	//根据老师id查找管理实验室
	public List<Lab> findByUserNumber(String userNumber);
}
