package com.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.AmbulanceDao;
import com.cdac.dto.Ambulance;

@Service
public class AmbulanceServiceImple implements AmbulanceService{

	@Autowired
	private AmbulanceDao ambulanceDao;
	
	@Override
	public void addAmbulance(Ambulance ambulance) {
		ambulanceDao.insertAmbulance(ambulance);
	}

	@Override
	public void removeAmbulance(int ambulanceId) {
		ambulanceDao.deleteAmbulance(ambulanceId);
	}

	@Override
	public Ambulance findAmbulance(int ambulanceId) {
		return ambulanceDao.selectAmbulance(ambulanceId);
	}

	@Override
	public void modifyAmbulance(Ambulance ambulance) {
		ambulanceDao.updateAmbulance(ambulance); 
	}

	@Override
	public List<Ambulance> selectAll(int patientId) {
		return ambulanceDao.selectAll(patientId);
	}
}
