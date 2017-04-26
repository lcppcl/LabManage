package com.java.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java.dao.TeacherDao;
import com.java.entity.Lab;
import com.java.entity.User;
import com.java.service.TeacherService;

@Service("TeacherService")
public class TeacherServiceImpl implements TeacherService {

	@Resource
	// spring×¢Èë
	private TeacherDao teacherDao;

	public int updateById(User user) {
		return teacherDao.updateById(user);
	}

	public User findById(Integer id) {
		return teacherDao.findById(id);
	}

	
	public List<Lab> findByUserNumber(String userNumber){
		return teacherDao.findByUserNumber(userNumber);
	}
}
