package com.java.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java.dao.EquipDao;
import com.java.entity.Equipment;
import com.java.service.EquipService;

@Service("equipService")
public class EquipServiceImpl implements EquipService {
	@Resource // springע��
	private EquipDao equipDao;
	// ����豸
	public Integer addEquip(Equipment equipment) {
		return equipDao.addEquip(equipment);
	}

	// �ж��豸�Ƿ����
	public Equipment findByEquipNumber(String equipNumber) {
		return equipDao.findByEquipNumber(equipNumber);
	}
	
	// �鿴�����豸
	public List<Equipment> getAllEquip(){
		return equipDao.getAllEquip();
	}

	// ɾ���豸
	public int deleteById(Integer id) {
		return equipDao.deleteById(id);
	}

	//����id����
	public Equipment findById(Integer id) {
		// TODO Auto-generated method stub
		return equipDao.findById(id);
	}

	//����id����
	public int updateById(Equipment equipment) {
		// TODO Auto-generated method stub
		return equipDao.updateById(equipment);
	}

	//��ȡ����û�б�������豸
	public List<Equipment> getAllEquipByFlag(int flag) {
		// TODO Auto-generated method stub
		return equipDao.getAllEquipByFlag(flag);
	}

	//���·���״̬
	public int updateFlag(String equipNumber) {
		// TODO Auto-generated method stub
		return equipDao.updateFlag(equipNumber);
	}
}
