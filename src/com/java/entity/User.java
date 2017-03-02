package com.java.entity;

//实体
public class User {
	private Integer id; // id
	private String userNumber; // 职工编号
	private String userName; // 用户名
	private String password; // 密码
	private String email; // 邮箱
	private String sex; // 性别
	private String address; // 地址
	private String phoneNumber; // 电话号码
	private String status; // 身份 （老师，管理员）

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userNumber=" + userNumber + ", userName="
				+ userName + ", password=" + password + ", email=" + email
				+ ", sex=" + sex + ", address=" + address + ", phoneNumber="
				+ phoneNumber + ", status=" + status + "]";
	}

}
