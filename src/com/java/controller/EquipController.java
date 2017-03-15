package com.java.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.java.entity.Equipment;
import com.java.entity.User;
import com.java.service.EquipService;
import com.java.util.ResponseUtil;

@Controller
@RequestMapping("/equip")
public class EquipController {
	@Resource
	private EquipService equipService;

	@RequestMapping("/addEquip")
	public String addTeacher(Equipment equipment, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		equipment.setInDate(new Date());
		equipment.setRepair(new Date());
		equipment.setFlag(0);
		Equipment flag = equipService.findByEquipNumber(equipment.getEquipNumber());
		StringBuffer result = new StringBuffer();
		if (flag != null) {
			result.append("<script language='javascript'>alert('已经存在，重新添加！');</script>");
		} else {
			int resultTotal = equipService.addEquip(equipment);
			result.append("<script language='javascript'>alert('添加成功！');</script>");
		}

		ResponseUtil.write(response, result);
		return null;
	}
	
	
	@RequestMapping("/getAllEquip")
	public String getAllEquip(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		List<Equipment> equipList = equipService.getAllEquip();
		request.setAttribute("equipList", equipList);
		return "forward:/jsp/admin/page/showEquip.jsp";
	} 
	
	@RequestMapping("/deleteById")
	public String deleteById(
			@RequestParam(value = "id", required = false) Integer id,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		equipService.deleteById(id);
		return "redirect:/jsp/admin/page/cheackEquip.jsp";
	}
	
	@RequestMapping("/findById")
	public String findById(
			@RequestParam(value = "id", required = false) Integer id,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		System.out.println("hahahahahha" + id);
		Equipment currentEquip = equipService.findById(id);
		request.setAttribute("currentEquip", currentEquip);
		return "forward:/jsp/admin/page/updateEquip.jsp";
	}
	
	@RequestMapping("/updateById")
	public String updateById(Equipment equipment, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		equipment.setRepair(new Date());
		equipService.updateById(equipment);
		return "redirect:/jsp/admin/page/cheackEquip.jsp";
	}
}
