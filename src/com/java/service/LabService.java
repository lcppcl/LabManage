package com.java.service;

import java.util.List;

import com.java.entity.Equipment;
import com.java.entity.Lab;

public interface LabService {
	// ��ӽ�����Ϣ
	public Integer addLab(Lab lab);

	// �жϽ����Ƿ����
	public Lab findByLabNumber(String labNumber);

}
