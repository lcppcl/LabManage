package com.java.entity;

//ʵ��
public class Lab {
	private Integer id; // id
	private String labNumber; // ʵ���ұ��
	private String labName; // ʵ��������
	private String labAddress; // ��ַ
	private String remark; // ����
	private String subject; // �������
	private String address; // ��ַ
	private Integer contain; // ��������
	private Equipment equipment; // �豸
	private User User; // ������ʦ

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Equipment getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}

	public User getUser() {
		return User;
	}

	public void setUser(User user) {
		User = user;
	}

}
