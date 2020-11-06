package com.cdac.service;

import com.cdac.dto.Patient;

public interface PatientService {
	void addPatient(Patient patient);
	boolean findPatient(Patient patient);
	
}
