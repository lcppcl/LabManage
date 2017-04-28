package com.java.dao;

import java.util.List;

import com.java.entity.Circumference;
import com.java.entity.Lab;
import com.java.entity.Lesson;
import com.java.entity.Week;

public interface LabDao {
	// 添加教室信息
	public Integer addLab(Lab lab);

	// 判断教室是否存在
	public Lab findByLabNumber(String labNumber);
	
	//获取所有实验室
	public List<Lab> getAllLab();
	
	//获取所有周
	public List<Circumference> getAllCircum();
	
	//获取所有节
	public List<Lesson> getAllLesson();
	
	//获取所有星期
	public List<Week> getAllWeek();
}
