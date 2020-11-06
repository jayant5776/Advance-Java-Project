package com.cdac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.PatientDao;
import com.cdac.dto.Patient;

@Service
public class PatientServiceImple implements PatientService{
	
	@Autowired
	private PatientDao patientDao;
	
	@Override
	public void addPatient(Patient patient) {
		patientDao.insertPatient(patient);
	}

	@Override
	public boolean findPatient(Patient patient) {
		return patientDao.checkPatient(patient);
	}

}
