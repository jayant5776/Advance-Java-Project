package com.cdac.cntr;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.dto.Ambulance;
import com.cdac.dto.Patient;
import com.cdac.service.AmbulanceService;

@Controller
public class AmbulanceController {
		
	@Autowired
	private AmbulanceService ambulanceService;
	
	@RequestMapping(value = "/prep_ambulance_add_form.htm", method = RequestMethod.GET)
	public String prepAmbulanceAddForm(ModelMap map) {
		map.put("ambulance", new Ambulance());
		return "ambulance_add_form";	
	}
	
	@RequestMapping(value = "/ambulance_add.htm", method = RequestMethod.POST)
	public String ambulanceAdd(Ambulance ambulance,ModelMap map, HttpSession session) {
		int patientId = ((Patient) session.getAttribute("patient")).getPatientId();
		ambulance.setPatientId(patientId);
		ambulanceService.addAmbulance(ambulance);
		return "ambulance_booking";	
	}
	
	@RequestMapping(value = "/ambulance_list.htm", method = RequestMethod.GET)
	public String allAmbulance(ModelMap map, HttpSession session) {
		int patientId = ((Patient) session.getAttribute("patient")).getPatientId();
		List<Ambulance> li = ambulanceService.selectAll(patientId);
		map.put("ambList", li);
		return "ambulance_list";
	}
	 
	@RequestMapping(value = "/ambulance_delete.htm", method = RequestMethod.GET)
	public String ambulanceDelete(@RequestParam(value="ambulanceId", required=true)Integer ambulanceId, ModelMap map, HttpSession session) {
		
		ambulanceService.removeAmbulance(ambulanceId);
		
		int patientId = ((Patient) session.getAttribute("patient")).getPatientId();
		List<Ambulance> li = ambulanceService.selectAll(patientId);
		map.put("ambList", li);
		return "ambulance_list";
	}
	
	@RequestMapping(value = "/ambulance_update_form.htm", method = RequestMethod.GET)
	public String ambulanceUpdateForm(@RequestParam(value="ambulanceId", required=true)Integer ambulanceId, ModelMap map, HttpSession session) {
		
		Ambulance amb = ambulanceService.findAmbulance(ambulanceId);
		map.put("ambulance", amb);
		return "ambulance_update_form";
	}
	
}
