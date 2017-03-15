package com.java.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java.dao.LabDao;
import com.java.entity.Lab;
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

}
