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

import com.cdac.dto.Patient;

@Repository
public class PatientDaoImple implements PatientDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void insertPatient(Patient patient) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.save(patient);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
		});
	}

	@Override
	public boolean checkPatient(Patient patient) {
		boolean b = hibernateTemplate.execute(new HibernateCallback<Boolean>() {

			@Override
			public Boolean doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from Patient where logName = ? and logPass = ?");
				q.setString(0, patient.getLogName());
				q.setString(1, patient.getLogPass());
				List<Patient> li = q.list();
				boolean flag = !li.isEmpty();
				patient.setPatientId(li.get(0).getPatientId());
				tr.commit();
				session.flush();
				session.close();
				return flag;
			}
		});
		return b;
	}

}
