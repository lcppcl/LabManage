package com.java.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.java.entity.User;
import com.java.service.AdminService;
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
		return "index";
	}

	@RequestMapping("/getAllTeacher")
	public String getAllTeacher(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		List<User> userList = adminService.getAllTeacher("老师");
		for(User s:userList){
			System.out.println(s);
		}
		request.setAttribute("userList",userList);
		return "forward:/jsp/admin/page/show.jsp";
	}
	
	@RequestMapping("/deleteById")
	public String deleteById(@RequestParam(value="id",required=false)Integer id,HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		adminService.deleteById(id);
		return "redirect:/jsp/admin/page/cheackTeacher.jsp";
	}

}
