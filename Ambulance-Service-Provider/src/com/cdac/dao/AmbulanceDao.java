package com.cdac.dao;

import java.util.List;

import com.cdac.dto.Ambulance;

public interface AmbulanceDao {
	void insertAmbulance(Ambulance ambulance);
	void deleteAmbulance(int ambulanceId);
	Ambulance selectAmbulance(int ambulanceId);
	void updateAmbulance(Ambulance ambulance);
	List<Ambulance> selectAll(int patientId);
}
