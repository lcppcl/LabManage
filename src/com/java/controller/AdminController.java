package com.java.controller;

import java.io.File;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.java.entity.User;
import com.java.service.AdminService;
import com.java.util.DateUtil;
import com.java.util.ResponseUtil;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Resource
	private AdminService adminService;

	@RequestMapping("/addTeacher")
	public String addTeacher(User user, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		user.setPassword(user.getUserNumber().toString());
		user.setStatus("老师");
		System.out.println(user);
		int resultTotal = adminService.addTeacher(user);
		StringBuffer result = new StringBuffer();
		if (resultTotal > 0) {
			result.append("<script language='javascript'>alert('添加成功！');</script>");
		} else {
			result.append("<script language='javascript'>alert('添加失败！');</script>");
		}
		ResponseUtil.write(response, result);
		return "redirect:/jsp/admin/addTeacher.jsp";
	}
}
