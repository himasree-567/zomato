package com.zomato.dao;

import com.zomato.entity.ZomatoEmployee;

public class ZomatoDAO implements ZomatoDAOInterface {
	private ZomatoDAO() {}

	public static ZomatoDAOInterface createDaoObject() {
		// TODO Auto-generated method stub
		return new ZomatoDAO();
	}

	@Override
	public int createProfileDAO(ZomatoEmployee fe) {
		// TODO Auto-generated method stub
		return 1;
	}


}
