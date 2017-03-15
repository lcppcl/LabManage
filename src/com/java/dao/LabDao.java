package com.java.dao;

import com.java.entity.Lab;

public interface LabDao {
	// 添加教室信息
	public Integer addLab(Lab lab);

	// 判断教室是否存在
	public Lab findByLabNumber(String labNumber);
	
}
