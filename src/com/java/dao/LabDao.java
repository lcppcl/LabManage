package com.java.dao;

import com.java.entity.Lab;

public interface LabDao {
	// ��ӽ�����Ϣ
	public Integer addLab(Lab lab);

	// �жϽ����Ƿ����
	public Lab findByLabNumber(String labNumber);
	
}
