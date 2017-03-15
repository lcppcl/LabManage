package com.java.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java.dao.EquipDao;
import com.java.entity.Equipment;
import com.java.service.EquipService;

@Service("equipService")
public class EquipServiceImpl implements EquipService {
	@Resource // spring注入
	private EquipDao equipDao;
	// 添加设备
	public Integer addEquip(Equipment equipment) {
		return equipDao.addEquip(equipment);
	}

	// 判断设备是否存在
	public Equipment findByEquipNumber(String equipNumber) {
		return equipDao.findByEquipNumber(equipNumber);
	}
	
	// 查看所有设备
	public List<Equipment> getAllEquip(){
		return equipDao.getAllEquip();
	}

	// 删除设备
	public int deleteById(Integer id) {
		return equipDao.deleteById(id);
	}

	//根据id查找
	public Equipment findById(Integer id) {
		// TODO Auto-generated method stub
		return equipDao.findById(id);
	}

	//根据id更新
	public int updateById(Equipment equipment) {
		// TODO Auto-generated method stub
		return equipDao.updateById(equipment);
	}

	//获取所有没有被分配的设备
	public List<Equipment> getAllEquipByFlag(int flag) {
		// TODO Auto-generated method stub
		return equipDao.getAllEquipByFlag(flag);
	}

	//更新分配状态
	public int updateFlag(String equipNumber) {
		// TODO Auto-generated method stub
		return equipDao.updateFlag(equipNumber);
	}
}
