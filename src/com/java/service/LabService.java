package com.java.service;

import java.util.List;

import com.java.entity.BookInfo;
import com.java.entity.Circumference;
import com.java.entity.Equipment;
import com.java.entity.Lab;
import com.java.entity.Lesson;
import com.java.entity.Week;

public interface LabService {
	// ��ӽ�����Ϣ
	public Integer addLab(Lab lab);

	// �жϽ����Ƿ����
	public Lab findByLabNumber(String labNumber);

	// ��ȡ����ʵ����
	public List<Lab> getAllLab();

	// ��ȡ������
	public List<Circumference> getAllCircum();

	// ��ȡ���н�
	public List<Lesson> getAllLesson();

	// ��ȡ��������
	public List<Week> getAllWeek();

	// �鿴ʵ�����Ƿ�Ԥ��
	public BookInfo isBook(BookInfo bookMessage);

	// Ԥ��ʵ����
	public void bookLab(BookInfo bookMessage);

}
