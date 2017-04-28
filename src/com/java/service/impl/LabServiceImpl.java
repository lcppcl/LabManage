package com.java.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java.dao.LabDao;
import com.java.entity.BookInfo;
import com.java.entity.Circumference;
import com.java.entity.Lab;
import com.java.entity.Lesson;
import com.java.entity.Week;
import com.java.service.LabService;

@Service("labService")
public class LabServiceImpl implements LabService {
	@Resource
	private LabDao labDao;

	// 添加教室信息
	public Integer addLab(Lab lab) {
		return labDao.addLab(lab);
	}

	// 判断教室是否存在
	public Lab findByLabNumber(String labNumber) {
		return labDao.findByLabNumber(labNumber);
	}

	// 获取所有实验室
	public List<Lab> getAllLab() {
		return labDao.getAllLab();
	}

	public List<Circumference> getAllCircum() {
		return labDao.getAllCircum();
	}

	public List<Lesson> getAllLesson() {
		return labDao.getAllLesson();
	}

	public List<Week> getAllWeek() {
		return labDao.getAllWeek();
	}

	public BookInfo isBook(BookInfo bookMessage) {
		return labDao.isBook(bookMessage);
	}

	public void bookLab(BookInfo bookMessage) {
		labDao.bookLab(bookMessage);
	}

}
