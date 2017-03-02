package com.java.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java.dao.AdminDao;
import com.java.entity.User;
import com.java.service.AdminService;
@Service("adminService")
public class AdminServiceImpl implements AdminService {

	@Resource // spring×¢Èë
	private AdminDao adminDao;

	public Integer addTeacher(User user) {
		return adminDao.addTeacher(user);
	}

	public List<User> getAllTeacher(String status) {
		return adminDao.getAllTeacher(status);
	}

	public int deleteById(Integer id) {
		return adminDao.deleteById(id);
	}

	public int updateById(User user) {
		return adminDao.updateById(user);
	}

	public User findById(Integer id) {
		return adminDao.findById(id);
	}

}
