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

import com.cdac.dto.Admin;

@Repository
public class AdminDaoImple implements AdminDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void insertAdmin(Admin admin) {
		hibernateTemplate.execute(new HibernateCallback<Admin>() {

			@Override
			public Admin doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.save(admin);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
		});
	}

	@Override
	public boolean checkAdmin(Admin admin) {
		boolean b = hibernateTemplate.execute(new HibernateCallback<Boolean>() {

			@Override
			public Boolean doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from Admin where email = ? and adPass = ?");
				q.setString(0, admin.getEmail());
				q.setString(1, admin.getAdPass());
				List<Admin> li = q.list();
				
				if(li.isEmpty()) {
					return false;
				}else {
				
				boolean flag = !li.isEmpty();
				admin.setAdminId(li.get(0).getAdminId());
				tr.commit();
				session.flush();
				session.close();
				return flag;
				}
			}
		});
		return b;
	}

}
