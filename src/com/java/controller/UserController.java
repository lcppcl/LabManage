package com.java.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.entity.Equipment;
import com.java.entity.User;
import com.java.service.AdminService;
import com.java.service.EquipService;
import com.java.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService userService;
	@Resource
	private AdminService adminService;
	@Resource
	private EquipService equipService;

	@RequestMapping("login")
	public String login(User user, HttpServletRequest request) {
		User resultUser = userService.login(user);
		if (resultUser != null) {
			if (resultUser.getStatus().equals("管理员")) {
				HttpSession session = request.getSession();
				session.setAttribute("resultUser", resultUser);
				return "redirect:/jsp/admin/page/user.jsp";
			} else {
				HttpSession session = request.getSession();
				session.setAttribute("resultUser", resultUser);
				return "redirect:/jsp/admin/page/user.jsp";
			}
		} else {
			request.setAttribute("user", user);
			request.setAttribute("errorMsg", "用户名或密码错误");
			return "index";
		}
	}

	@RequestMapping("show")
	public String show(HttpServletRequest request) {
		HttpSession session = request.getSession();
		List<User> userList = adminService.getAllTeacher("老师");
		session.setAttribute("userListForLab", userList);
		List<Equipment> equipList = equipService.getAllEquipByFlag(0);
		for(Equipment e : equipList){
			System.out.println(e);
		}
		session.setAttribute("equipListForLab", equipList);
		return "redirect:/jsp/admin/page/addLib.jsp";
	}

}
