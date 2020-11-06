package com.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.AmbDao;
import com.cdac.dto.Amb;

@Service
public class AmbServiceImple implements AmbService{

	@Autowired
	private AmbDao ambDao;
	
	@Override
	public void addAmb(Amb amb) {
		ambDao.insertAmb(amb);
	}

	@Override
	public void removeAmb(int ambId) {
		ambDao.deleteAmb(ambId);
	}

	@Override
	public Amb findAmb(int ambId) {
		return ambDao.selectAmb(ambId);
	}

	@Override
	public void modifyAmb(Amb amb) {
		ambDao.updateAmb(amb);
	}

	@Override
	public List<Amb> selectAll(int adminId) {
		return ambDao.selectAll(adminId);
	}

}
