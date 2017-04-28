package com.java.dao;

import java.util.List;

import com.java.entity.Lab;
import com.java.entity.User;

public interface TeacherDao {
	// 根据id修改
	public int updateById(User user);

	// 根据id查找
	public User findById(Integer id);
	
	//根据老师id查找管理实验室
	public List<Lab> findByUserNumber(String userNumber);
	
}
