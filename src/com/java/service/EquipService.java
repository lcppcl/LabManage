package com.java.service;

import java.util.List;

import com.java.entity.Equipment;

public interface EquipService {
	// 添加设备
	public Integer addEquip(Equipment equipment);

	// 判断设备是否存在
	public Equipment findByEquipNumber(String equipNumber);

	// 查看所有设备
	public List<Equipment> getAllEquip();

	// 根据id删除设备
	public int deleteById(Integer id);

	// 根据id查找
	public Equipment findById(Integer id);
	
	// 根据id修改
	public int updateById(Equipment equipment);


}
