package com.zomato.service;

import com.zomato.dao.ZomatoDAO;
import com.zomato.dao.ZomatoDAOInterface;
import com.zomato.entity.ZomatoEmployee;

public class ZomatoService implements ZomatoServiceInterface {
	private ZomatoService() {}

	public static ZomatoServiceInterface CreateserviceObject() {
		// TODO Auto-generated method stub
		return new ZomatoService();
	}

	@Override
	public int createProfile(ZomatoEmployee fe) {
		// TODO Auto-generated method stub
		ZomatoDAOInterface fd=ZomatoDAO.createDaoObject();
		return fd.createProfileDAO(fe);
	}

	

}
