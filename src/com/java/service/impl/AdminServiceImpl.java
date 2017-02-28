package com.java.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java.dao.AdminDao;
import com.java.entity.User;
import com.java.service.AdminService;
@Service("adminService")
public class AdminServiceImpl implements AdminService {

	@Resource // springע��
	private AdminDao adminDao;

	public Integer addTeacher(User user) {
		return adminDao.addTeacher(user);
	}

}
