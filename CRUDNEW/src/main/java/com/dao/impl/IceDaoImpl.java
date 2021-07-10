package com.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.dao.IceDao;
import com.model.Icecream;
@Controller("IceDao")
public class IceDaoImpl implements IceDao {
	@Autowired
	SessionFactory sessionFactory;
	protected Session currentSession()
	{
		return sessionFactory.getCurrentSession();
	}


	public void saveice(Icecream icecream) {
		
		currentSession().save(icecream);
	}


	public void updatice(Icecream icecream) {
		currentSession().update(icecream);

	}


	public void deleteice(Icecream icecream) {
		currentSession().delete(icecream);

	}


	public Icecream editice(int id) {
		// TODO Auto-generated method stub
		return  findFlaver(id);
	}

	public Icecream editice1(int id) {
		// TODO Auto-generated method stub
		return  findFlaver(id);
	}

	
	public Icecream findFlaver(int id) {
		// TODO Auto-generated method stub
		return currentSession().get(Icecream.class, id);
	}

	
	public List<Icecream> getAllIcecreams() {
		
		return currentSession().createCriteria(Icecream.class).list();
	}



	

	
}
