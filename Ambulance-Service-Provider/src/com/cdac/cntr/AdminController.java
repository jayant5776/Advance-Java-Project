package com.cdac.cntr;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cdac.dto.Admin;
import com.cdac.service.AdminService;
import com.cdac.valid.AdminValidator;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private AdminValidator adminValidator;
	
	@RequestMapping(value = "/admin_reg_form.htm", method = RequestMethod.GET)
	public String adminRegForm(ModelMap map) {
		map.put("admin", new Admin());
		return "reg_form_admin";	
	}
	
	@RequestMapping(value = "/regAdmin.htm", method = RequestMethod.POST)
	public String regAdmin(Admin admin, ModelMap map) {
		adminService.addAdmin(admin);
		return "admin_login_registration";
	}
	
	@RequestMapping(value = "/admin_log_form.htm", method = RequestMethod.GET)
	public String adminLogForm(ModelMap map) {
		map.put("admin", new Admin());
		return "login_form_admin";
	}
	
	@RequestMapping(value = "/loginAdmin.htm", method = RequestMethod.POST)
	public String loginAdmin(Admin admin, BindingResult result, ModelMap map,HttpSession session) {
		
		adminValidator.validate(admin, result);
		if(result.hasErrors()) {
			return "login_form_admin";
		}
		
		boolean b = adminService.findAdmin(admin);
		if(b) {
			session.setAttribute("admin", admin);
			return "amb_booking";
		}else {
			map.put("admin", new Admin());
			return "login_form_admin";
		}
	}
	
	@RequestMapping(value = "/logout.htm", method = RequestMethod.GET)
	public String logoutAdmin(HttpSession session, ModelMap map) {
		session.removeAttribute("admin");
		session.invalidate();
		map.put("admin", new Admin());
		return "login_form_admin";
	}

}
