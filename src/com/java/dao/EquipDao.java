package com.java.dao;

import java.util.List;

import com.java.entity.Equipment;
import com.java.entity.User;

public interface EquipDao {
	// ����豸
	public Integer addEquip(Equipment equipment);

	// �ж��豸�Ƿ����
	public Equipment findByEquipNumber(String equipNumber);

	// �鿴�����豸
	public List<Equipment> getAllEquip();

	// ����idɾ���豸
	public int deleteById(Integer id);

	// ����id�޸�
	public int updateById(Equipment equipment);

	// ����id����
	public Equipment findById(Integer id);


	// ����number����
	// public User findByNumber(String userNumber);
}
