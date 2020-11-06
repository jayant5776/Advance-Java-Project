package com.cdac.service;

import java.util.List;

import com.cdac.dto.Ambulance;

public interface AmbulanceService {
	void addAmbulance(Ambulance ambulance);
	void removeAmbulance(int ambulanceId);
	Ambulance findAmbulance(int ambulanceId);
	void modifyAmbulance(Ambulance ambulance);
	List<Ambulance> selectAll(int patientId);
}
