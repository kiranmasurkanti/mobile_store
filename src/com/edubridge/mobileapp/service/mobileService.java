package com.edubridge.mobileapp.service;

import java.util.List;

import com.edubridge.mobileapp.model.Mobile;

public interface mobileService {
	void addmobile(Mobile mobile);
	void update (String brand,String brand1);
	void removemobile(Mobile mobile);
	Mobile searchmobile(String brand);
	List<Mobile> displayMobiles();

}
