package com.java.entity;

import java.io.Serializable;

//ʵ��
public class Lab implements Serializable{
	private Integer id; // id
	private String labNumber; // ʵ���ұ��
	private String labName; // ʵ��������
	private String labAddress; // ��ַ
	private String remark; // ����
	private String subject; // �������
	private Integer contain; // ��������
	private String equipNumber; // �豸
	private String userNumber; // ������ʦ
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLabNumber() {
		return labNumber;
	}

	public void setLabNumber(String labNumber) {
		this.labNumber = labNumber;
	}

	public Integer getContain() {
		return contain;
	}

	public void setContain(Integer contain) {
		this.contain = contain;
	}

	public String getLabName() {
		return labName;
	}

	public void setLabName(String labName) {
		this.labName = labName;
	}

	public String getLabAddress() {
		return labAddress;
	}

	public void setLabAddress(String labAddress) {
		this.labAddress = labAddress;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getEquipNumber() {
		return equipNumber;
	}

	public void setEquipNumber(String equipNumber) {
		this.equipNumber = equipNumber;
	}

	public String getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	
}
