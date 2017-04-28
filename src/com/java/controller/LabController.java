package com.java.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.entity.Circumference;
import com.java.entity.Lab;
import com.java.entity.Lesson;
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
			result.append("<script language='javascript'>alert('�Ѿ����ڣ�������ӣ�');</script>");
		} else {
			int flag2 = equipService.updateFlag(lab.getEquipNumber());
			int resultTotal = labService.addLab(lab);
			result.append("<script language='javascript'>alert('��ӳɹ���');</script>");
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
}
