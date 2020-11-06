package com.cdac.cntr;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cdac.dto.Patient;
import com.cdac.service.PatientService;

@Controller
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	
	@RequestMapping(value = "/patient_reg_form.htm", method = RequestMethod.GET)
	public String patientRegForm(ModelMap map) {
		map.put("patient", new Patient());
		return "reg_form_patient";	
	}
	
	@RequestMapping(value = "/reg.htm", method = RequestMethod.POST)
	public String register(Patient patient, ModelMap map) {
		patientService.addPatient(patient);
		return "Patient_login_registration";
	}
	
	@RequestMapping(value = "/patient_log_form.htm", method = RequestMethod.GET)
	public String patientLogForm(ModelMap map) {
		map.put("patient", new Patient());
		return "login_form_patient";
	}
	
	@RequestMapping(value = "/login.htm", method = RequestMethod.POST)
	public String login(Patient patient, ModelMap map, HttpSession session) {
		boolean b = patientService.findPatient(patient);
		if(b) {
			session.setAttribute("patient", patient);
			return "ambulance_booking";
		}else {
			map.put("patient", new Patient());
			return "login_form_patient";
		}
	}
	
}
