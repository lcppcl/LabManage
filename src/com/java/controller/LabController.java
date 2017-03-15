package com.java.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.entity.Equipment;
import com.java.entity.Lab;
import com.java.service.AdminService;
import com.java.service.EquipService;
import com.java.service.LabService;
import com.java.util.ResponseUtil;

@Controller
@RequestMapping("/lab")
public class LabController {
	@Resource
	private EquipService equipService;
	@Resource
	private AdminService adminService;
	@Resource
	private LabService labService;
	@RequestMapping("/addLab")
	public String addTeacher(Lab lab, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Lab flag = labService.findByLabNumber(lab.getLabNumber());
		System.out.println(lab);
		StringBuffer result = new StringBuffer();
		if (flag != null) {
			result.append("<script language='javascript'>alert('已经存在，重新添加！');</script>");
		} else {
			int flag2 = equipService.updateFlag(lab.getEquipNumber());
			int resultTotal = labService.addLab(lab);
			result.append("<script language='javascript'>alert('添加成功！');</script>");
		}

		ResponseUtil.write(response, result);
		return null;
	}
}
