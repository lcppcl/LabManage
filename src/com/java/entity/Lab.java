package com.java.entity;

//实体
public class Lab {
	private Integer id; // id
	private String labNumber; // 实验室编号
	private String labName; // 实验室名称
	private String labAddress; // 地址
	private String remark; // 详情
	private String subject; // 所属类别
	private String address; // 地址
	private Integer contain; // 容纳人数
	private Equipment equipment; // 设备
	private User User; // 管理老师

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
