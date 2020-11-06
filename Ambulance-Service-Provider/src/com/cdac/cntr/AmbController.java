package com.cdac.cntr;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.dto.Admin;
import com.cdac.dto.Amb;
import com.cdac.service.AmbService;

@Controller
public class AmbController {
	
	@Autowired
	private AmbService ambService;
	
	@RequestMapping(value = "/prep_amb_add_form.htm", method = RequestMethod.GET)
	public String prepAmbAddForm(ModelMap map) {
		map.put("amb", new Amb());
		return "amb_add_form";	
	}
	
	@RequestMapping(value = "/amb_add.htm", method = RequestMethod.POST)
	public String ambAdd(Amb amb, HttpSession session) {
		int adminId = ((Admin)session.getAttribute("admin")).getAdminId();
		amb.setAdminId(adminId);
		ambService.addAmb(amb);
		return "amb_booking";	
	}
	
	@RequestMapping(value = "/amb_list.htm", method = RequestMethod.GET)
	public String allAmb(ModelMap map, HttpSession session) {
		int adminId = ((Admin)session.getAttribute("admin")).getAdminId();
		List<Amb> li = ambService.selectAll(adminId);
		map.put("ambList", li);
		return "amb_list";
	}
	
	@RequestMapping(value = "/amb_delete.htm", method = RequestMethod.GET)
	public String ambDelete(@RequestParam int ambId, ModelMap map, HttpSession session) {
		
		ambService.removeAmb(ambId);
		
		int adminId = ((Admin)session.getAttribute("admin")).getAdminId();
		List<Amb> li = ambService.selectAll(adminId);
		map.put("ambList", li);
		return "amb_list";
	} 	
	
	@RequestMapping(value = "/amb_update_form.htm", method = RequestMethod.GET)
	public String ambUpdateForm(@RequestParam int ambId, ModelMap map) {
		
		Amb am = ambService.findAmb(ambId);
		map.put("amb", am);
		return "amb_update_form";
	} 	
	
	@RequestMapping(value = "/amb_update.htm", method = RequestMethod.POST)
	public String ambUpdate(Amb amb, ModelMap map, HttpSession session) {
		
		int adminId = ((Admin)session.getAttribute("admin")).getAdminId();
		amb.setAdminId(adminId);
		ambService.modifyAmb(amb);

		List<Amb> li = ambService.selectAll(adminId);
		map.put("ambList", li);
		return "amb_list";
	}

}
