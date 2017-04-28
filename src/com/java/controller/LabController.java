package com.java.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.entity.BookInfo;
import com.java.entity.Circumference;
import com.java.entity.Lab;
import com.java.entity.Lesson;
import com.java.entity.User;
import com.java.entity.Week;
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

	@RequestMapping("/getAllLab")
	public String getAllLab(HttpServletRequest request,
			HttpServletResponse response) {
		List<Lab> labList = labService.getAllLab();
		List<Circumference> circumList = labService.getAllCircum();
		List<Lesson> lessonList = labService.getAllLesson();
		List<Week> weekList = labService.getAllWeek();
		request.setAttribute("labList", labList);
		request.setAttribute("circumList", circumList);
		request.setAttribute("lessonList", lessonList);
		request.setAttribute("weekList", weekList);
		for (Lab lab : labList) {
			System.out.println(lab.toString());
		}
		return "forward:/jsp/teacher/page/bookLab.jsp";
	}

	@RequestMapping("/bookLab")
	public String bookLab(BookInfo bookInfo, HttpSession session,
			HttpServletRequest request) throws Exception {
		StringBuffer result = new StringBuffer();
		User user = (User) session.getAttribute("resultUser");
		bookInfo.setTeacher(user.getUserName());
		System.out.println(bookInfo.toString()+"hhhhhhhhhh");
		BookInfo bookMessage1 = labService.isBook(bookInfo);
		if(bookMessage1 == null){
			labService.bookLab(bookInfo);
			request.setAttribute("errorInfo", "预定成功");
		}else{
			request.setAttribute("errorInfo", "已经预定");
		}
		return "forward:/jsp/teacher/page/bookLab1.jsp";
	}
}
