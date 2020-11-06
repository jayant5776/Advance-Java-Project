package com.cdac.dao;

import com.cdac.dto.Patient;

public interface PatientDao {
	void insertPatient(Patient patient);
	boolean checkPatient(Patient patient);
}
