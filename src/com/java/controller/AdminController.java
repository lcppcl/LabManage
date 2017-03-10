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
		User flag = adminService.findByNumber(user.getUserNumber());
		StringBuffer result = new StringBuffer();
		if (flag != null) {
			result.append("<script language='javascript'>alert('已经存在，重新添加！');</script>");
		} else {
			user.setPassword(user.getUserNumber());
			user.setStatus("老师");
			System.out.println(user);
			int resultTotal = adminService.addTeacher(user);
			result.append("<script language='javascript'>alert('添加成功！');</script>");
		}

		ResponseUtil.write(response, result);
		return "forward:/jsp/admin/page/addTeacher.jsp";
	}

	@RequestMapping("/getAllTeacher")
	public String getAllTeacher(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		List<User> userList = adminService.getAllTeacher("老师");
		for (User s : userList) {
			System.out.println(s);
		}
		request.setAttribute("userList", userList);
		return "forward:/jsp/admin/page/showTeacher.jsp";
	}

	@RequestMapping("/deleteById")
	public String deleteById(
			@RequestParam(value = "id", required = false) Integer id,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		adminService.deleteById(id);
		return "redirect:/jsp/admin/page/cheackTeacher.jsp";
	}

	@RequestMapping("/updateById")
	public String updateByUserNumber(User user, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println(user.toString());
		System.out.println(user.getId());
		adminService.updateById(user);
		return "redirect:/jsp/admin/page/cheackTeacher.jsp";
	}

	@RequestMapping("/findById")
	public String findByUserNumber(
			@RequestParam(value = "id", required = false) Integer id,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		System.out.println("hahahahahha" + id);
		User currentUser = adminService.findById(id);
		System.out.println(currentUser.toString());
		request.setAttribute("currentUser", currentUser);
		return "forward:/jsp/admin/page/updateTeacher.jsp";
	}

}
