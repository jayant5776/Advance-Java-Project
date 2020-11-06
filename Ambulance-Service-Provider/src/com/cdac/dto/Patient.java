package com.cdac.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patient")
public class Patient {
	@Id
	@GeneratedValue
	@Column(name = "patient_id")
	private int patientId;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String LastName;
	@Column(name = "log_name")
	private String logName;
	@Column(name = "log_pass")
	private String logPass;
	@Column(name = "birth_date")
	private String birthDate;
	@Column(name = "city")
	private String city;
	@Column(name = "amdate")
	private String AmDate;
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	public String getLogName() {
		return logName;
	}

	public void setLogName(String logName) {
		this.logName = logName;
	}

	public String getLogPass() {
		return logPass;
	}

	public void setLogPass(String logPass) {
		this.logPass = logPass;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAmDate() {
		return AmDate;
	}

	public void setAmDate(String amDate) {
		AmDate = amDate;
	}

}
