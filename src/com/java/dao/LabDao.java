package com.java.dao;

import java.util.List;

import com.java.entity.Circumference;
import com.java.entity.Lab;
import com.java.entity.Lesson;
import com.java.entity.Week;

public interface LabDao {
	// ��ӽ�����Ϣ
	public Integer addLab(Lab lab);

	// �жϽ����Ƿ����
	public Lab findByLabNumber(String labNumber);
	
	//��ȡ����ʵ����
	public List<Lab> getAllLab();
	
	//��ȡ������
	public List<Circumference> getAllCircum();
	
	//��ȡ���н�
	public List<Lesson> getAllLesson();
	
	//��ȡ��������
	public List<Week> getAllWeek();
}
