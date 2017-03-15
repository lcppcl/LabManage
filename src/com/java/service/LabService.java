package com.java.service;

import java.util.List;

import com.java.entity.Equipment;
import com.java.entity.Lab;

public interface LabService {
	// 添加教室信息
	public Integer addLab(Lab lab);

	// 判断教室是否存在
	public Lab findByLabNumber(String labNumber);

}
