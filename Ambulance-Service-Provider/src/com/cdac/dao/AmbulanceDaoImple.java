package com.cdac.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.cdac.dto.Ambulance;

@Repository
public class AmbulanceDaoImple implements AmbulanceDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void insertAmbulance(Ambulance ambulance) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.save(ambulance);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
		});
	}

	@Override
	public void deleteAmbulance(int ambulanceId) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.delete(new Ambulance(ambulanceId));
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
		});
	}

	@Override
	public Ambulance selectAmbulance(int ambulanceId) {
		Ambulance ambulance = hibernateTemplate.execute(new HibernateCallback<Ambulance>() {

			@Override
			public Ambulance doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Ambulance amb = (Ambulance) session.get(Ambulance.class, ambulanceId);
				tr.commit();
				session.flush();
				session.close();
				return amb;
			}
		});
		return ambulance;
	}

	@Override
	public void updateAmbulance(Ambulance ambulance) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Ambulance amb = (Ambulance) session.get(Ambulance.class, ambulance.getAmbulanceId());
				amb.setAmbulanceNo(ambulance.getAmbulanceNo());
				amb.setAmbulanceType(ambulance.getAmbulanceType());
				amb.setEquipement(ambulance.getEquipement());
				amb.setLocation(ambulance.getLocation());
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
		});
	}

	@Override
	public List<Ambulance> selectAll(int patientId) {
		List<Ambulance> ambList = hibernateTemplate.execute(new HibernateCallback<List<Ambulance>>() {

			@Override
			public List<Ambulance> doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from Ambulance where patientId = ?");
				q.setInteger(0, patientId);
				List<Ambulance> li = q.list();
				System.out.println(li);
				tr.commit();
				session.flush();
				session.close();
				return li;
			}
		});
		return ambList;
	}

}
