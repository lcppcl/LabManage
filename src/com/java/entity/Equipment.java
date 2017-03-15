package com.java.entity;

import java.io.Serializable;
import java.util.Date;

public class Equipment implements Serializable{
	private Integer id; // id
	private String equipNumber;//器材编号
	private String name;//器材名称
	private Integer number;//器材数量
	private Integer fine;//好的器材数量
	private Date inDate;//引进器材时间
	private Date repair;//维修时间
	private int flag;//是否已经安排教室
	
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public String getEquipNumber() {
		return equipNumber;
	}
	public void setEquipNumber(String equipNumber) {
		this.equipNumber = equipNumber;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Integer getFine() {
		return fine;
	}
	public void setFine(Integer fine) {
		this.fine = fine;
	}
	
	public Date getInDate() {
		return inDate;
	}
	public void setInDate(Date inDate) {
		this.inDate = inDate;
	}
	public Date getRepair() {
		return repair;
	}
	public void setRepair(Date repair) {
		this.repair = repair;
	}
	@Override
	public String toString() {
		return "Equipment [id=" + id + ", equipNumber=" + equipNumber
				+ ", name=" + name + ", number=" + number + ", fine=" + fine
				+ ", inDate=" + inDate + ", repair=" + repair + "]";
	}

	
}
