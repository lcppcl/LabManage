package com.java.dao;

import java.util.List;

import com.java.entity.User;

public interface AdminDao {
	// 添加老师
	public Integer addTeacher(User user);

	// 判断老师是否存在
	public User isExist(User user);

	// 查看所有老师
	public List<User> getAllTeacher(String status);

	// 根据id删除老师
	public int deleteById(Integer id);

	// 根据id修改
	public int updateById(User user);

	// 根据id查找
	public User findById(Integer id);

	// 根据number查找
	public User findByNumber(String userNumber);
}
