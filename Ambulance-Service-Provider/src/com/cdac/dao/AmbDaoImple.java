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

import com.cdac.dto.Amb;

@Repository
public class AmbDaoImple implements AmbDao{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void insertAmb(Amb amb) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.save(amb);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
		});
	}

	@Override
	public void deleteAmb(int ambId) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.delete(new Amb(ambId));
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
		});
	}

	@Override
	public Amb selectAmb(int ambId) {
		Amb amb = hibernateTemplate.execute(new HibernateCallback<Amb>() {

			@Override
			public Amb doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Amb am = (Amb) session.get(Amb.class, ambId);
				tr.commit();
				session.flush();
				session.close();
				return am;
			}
		});
		return amb;
	}

	@Override
	public void updateAmb(Amb amb) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();

//				Amb am = (Amb) session.get(Amb.class, amb.getAmbId());
//				am.setAmbNo(amb.getAmbNo());
//				am.setAmbType(amb.getAmbType());
//				am.setHospital(amb.getHospital());
//				am.setLocation(amb.getLocation());
				
				session.update(amb);
				
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
		});
		
	}

	@Override
	public List<Amb> selectAll(int adminId) {
		List<Amb> ambList = hibernateTemplate.execute(new HibernateCallback<List<Amb>>() {

			@Override
			public List<Amb> doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from Amb where adminId = ?");
				q.setInteger(0, adminId);
				List<Amb> li = q.list();
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
