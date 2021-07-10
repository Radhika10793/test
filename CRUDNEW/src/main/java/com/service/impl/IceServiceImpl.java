package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dao.IceDao;
import com.model.Icecream;
import com.service.IceService;



@Service("iceService")
@Transactional(propagation=Propagation.SUPPORTS,rollbackFor=Exception.class)
public class IceServiceImpl implements IceService
{
	@Autowired
	IceDao icedao;
	
	public void saveice(Icecream icecream) 
	{
		icedao.saveice(icecream);
	}

	
	public void updatice(Icecream icecream) {
		icedao.updatice(icecream);

	}


	public void deleteice(Icecream icecream) {
		icedao.deleteice(icecream);

	}

	
	public Icecream editice(int id) {
		
		return icedao.findFlaver(id);
	}

	public Icecream editice1(int id) {
		
		return icedao.findFlaver(id);
	}


	public Icecream findFlaver(int id)
	{
		return icedao.findFlaver(id);
	}

	
	public List<Icecream> getAllIcecreams() {
		// TODO Auto-generated method stub
		return icedao.getAllIcecreams();	}

}
