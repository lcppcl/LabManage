package com.java.service;

import java.util.List;

import com.java.entity.Equipment;

public interface EquipService {
	// ����豸
	public Integer addEquip(Equipment equipment);

	// �ж��豸�Ƿ����
	public Equipment findByEquipNumber(String equipNumber);

	// �鿴�����豸
	public List<Equipment> getAllEquip();

	// ����idɾ���豸
	public int deleteById(Integer id);

	// ����id����
	public Equipment findById(Integer id);
	
	// ����id�޸�
	public int updateById(Equipment equipment);


}
