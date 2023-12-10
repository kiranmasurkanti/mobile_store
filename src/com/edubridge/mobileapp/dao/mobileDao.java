package com.edubridge.mobileapp.dao;

import java.util.List;

import com.edubridge.mobileapp.model.Mobile;

public interface mobileDao {
	void addmobile(Mobile mobile);
	void update (String brand, String brand1);
	void removemobile(Mobile mobile);
	Mobile searchmobile(String brand);
	List<Mobile> displayMobiles();

}
