package com.cdac.service;

import java.util.List;

import com.cdac.dto.Amb;

public interface AmbService {
	void addAmb(Amb amb);
	void removeAmb(int ambId);
	Amb findAmb(int ambId);
	void modifyAmb(Amb amb);
	List<Amb> selectAll(int adminId);
}
