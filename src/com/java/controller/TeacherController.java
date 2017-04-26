package com.java.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.entity.Lab;
import com.java.entity.User;
import com.java.service.TeacherService;

@Controller
@RequestMapping("/teacher")
public class TeacherController {
	@Resource
	private TeacherService teacherService;

	@RequestMapping("/updateById")
	public String updateByUserNumber(User user, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println(user.toString());
		System.out.println(user.getId());
		teacherService.updateById(user);
		User user2 = teacherService.findById(user.getId());
		request.setAttribute("resultUser", user2);
		return "forward:/jsp/teacher/page/cheackMessage.jsp";
	}
	
	@RequestMapping("/findByUserNumber")
	public String findByUserNumber( HttpSession session,HttpServletRequest request) throws Exception {
		User user = (User) session.getAttribute("resultUser");;
		System.out.println(user.toString());
		String userNumber = user.getUserNumber();
		List<Lab> labList = teacherService.findByUserNumber(userNumber);
		request.setAttribute("labList", labList);
		return "forward:/jsp/teacher/page/showLabMessage.jsp";
	}
}
