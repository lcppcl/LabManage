package com.java.dao;

import java.util.List;

import com.java.entity.User;

public interface AdminDao {
	// �����ʦ
	public Integer addTeacher(User user);

	// �ж���ʦ�Ƿ����
	public User isExist(User user);

	// �鿴������ʦ
	public List<User> getAllTeacher(String status);

	// ����idɾ����ʦ
	public int deleteById(Integer id);

	// ����id�޸�
	public int updateById(User user);

	// ����id����
	public User findById(Integer id);

	// ����number����
	public User findByNumber(String userNumber);
}
