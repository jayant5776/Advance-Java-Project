package com.cdac.dao;

import java.util.List;

import com.cdac.dto.Amb;

public interface AmbDao {
	void insertAmb(Amb amb);
	void deleteAmb(int ambId);
	Amb selectAmb(int ambId);
	void updateAmb(Amb amb);
	List<Amb> selectAll(int adminId);
}
