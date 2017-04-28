package com.java.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java.dao.LabDao;
import com.java.entity.Circumference;
import com.java.entity.Lab;
import com.java.entity.Lesson;
import com.java.entity.Week;
import com.java.service.LabService;

@Service("labService")
public class LabServiceImpl implements LabService {
	@Resource
	private LabDao labDao;

	// ��ӽ�����Ϣ
	public Integer addLab(Lab lab) {
		return labDao.addLab(lab);
	}

	// �жϽ����Ƿ����
	public Lab findByLabNumber(String labNumber) {
		return labDao.findByLabNumber(labNumber);
	}

	// ��ȡ����ʵ����
	public List<Lab> getAllLab() {
		return labDao.getAllLab();
	}

	public List<Circumference> getAllCircum() {
		// TODO Auto-generated method stub
		return labDao.getAllCircum();
	}

	public List<Lesson> getAllLesson() {
		// TODO Auto-generated method stub
		return labDao.getAllLesson();
	}

	public List<Week> getAllWeek() {
		// TODO Auto-generated method stub
		return labDao.getAllWeek();
	}

}
