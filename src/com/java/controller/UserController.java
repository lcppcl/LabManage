package com.java.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.entity.User;
import com.java.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService userService;

	@RequestMapping("login")
	public String login(User user, HttpServletRequest request) {
		User resultUser = userService.login(user);
		if (resultUser != null) {
			if (resultUser.getStatus().equals("管理员")) {
				HttpSession session = request.getSession();
				session.setAttribute("currentUser", resultUser);
				return "redirect:/jsp/admin/user.jsp";
			} else {
				HttpSession session = request.getSession();
				session.setAttribute("currentUser", resultUser);
				return "redirect:/jsp/admin/user.jsp";
			}
		} else {
			request.setAttribute("user", user);
			request.setAttribute("errorMsg", "用户名或密码错误");
			return "index";
		}
	}
}
