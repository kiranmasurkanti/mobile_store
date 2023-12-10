package com.edubridge.mobileapp.service;

import java.util.List;

import com.edubridge.mobileapp.dao.mobileDao;
import com.edubridge.mobileapp.dao.mobileDaoImpl;
import com.edubridge.mobileapp.model.Mobile;

public class mobileServiceImpl implements mobileService{
	mobileDao dao = new mobileDaoImpl();
	
	@Override
	public void addmobile(Mobile mobile) {
	dao.addmobile(mobile);
		
		
	}


	@Override
	public void removemobile(Mobile mobile) {
	 dao.removemobile(mobile);
		
	}

	@Override
	public Mobile searchmobile(String brand) {
		
		return dao.searchmobile(brand);
	}


	@Override
	public void update(String brand, String brand1) {
		dao.update(brand, brand1);
		
	}
	@Override
	public List<Mobile> displayMobiles() {
		
		return dao.displayMobiles();
	}

}
