package com.java.dao;

import java.util.List;

import com.java.entity.Equipment;
import com.java.entity.User;

public interface EquipDao {
	// 添加设备
	public Integer addEquip(Equipment equipment);

	// 判断设备是否存在
	public Equipment findByEquipNumber(String equipNumber);

	// 查看所有设备
	public List<Equipment> getAllEquip();

	// 根据id删除设备
	public int deleteById(Integer id);

	// 根据id修改
	public int updateById(Equipment equipment);

	// 根据id查找
	public Equipment findById(Integer id);


	// 根据number查找
	// public User findByNumber(String userNumber);
}
