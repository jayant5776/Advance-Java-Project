package com.cdac.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ambulance")
public class Ambulance {
	@Id
	@GeneratedValue
	@Column(name = "ambulance_id")
	private int ambulanceId;
	@Column(name = "ambulance_no")
	private String ambulanceNo;
	@Column(name = "ambulance_type")
	private String ambulanceType;
	@Column(name = "location")
	private String location;
	@Column(name = "equipement")
	private String equipement;
	@Column(name = "patient_id")
	private int patientId;
	
	public Ambulance() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Ambulance(int ambulanceId) {
		this.ambulanceId = ambulanceId;
	}

	public int getAmbulanceId() {
		return ambulanceId;
	}

	public void setAmbulanceId(int ambulanceId) {
		this.ambulanceId = ambulanceId;
	}

	public String getAmbulanceNo() {
		return ambulanceNo;
	}

	public void setAmbulanceNo(String ambulanceNo) {
		this.ambulanceNo = ambulanceNo;
	}

	public String getAmbulanceType() {
		return ambulanceType;
	}

	public void setAmbulanceType(String ambulanceType) {
		this.ambulanceType = ambulanceType;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEquipement() {
		return equipement;
	}

	public void setEquipement(String equipement) {
		this.equipement = equipement;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
}
