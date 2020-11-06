package com.cdac.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "amb")
public class Amb {
	@Id
	@Column(name = "amb_id")
	@GeneratedValue
	private int ambId;
	@Column(name = "amb_no")
	private String ambNo;
	@Column(name = "amb_type")
	private String ambType;
	@Column(name = "location")
	private String location;
	@Column(name = "hospital")
	private String hospital;
	@Column(name = "admin_id")
	private int adminId;
	
	public Amb() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Amb(int ambId) {
		super();
		this.ambId = ambId;
	}

	public int getAmbId() {
		return ambId;
	}

	public void setAmbId(int ambId) {
		this.ambId = ambId;
	}

	public String getAmbNo() {
		return ambNo;
	}

	public void setAmbNo(String ambNo) {
		this.ambNo = ambNo;
	}

	public String getAmbType() {
		return ambType;
	}

	public void setAmbType(String ambType) {
		this.ambType = ambType;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getHospital() {
		return hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
}
