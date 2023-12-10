package com.edubridge.mobileapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.edubridge.mobileapp.model.Mobile;
import com.edubridge.mobileapp.connection.Dbutil;
import com.edubridge.mobileapp.main.*;
public class mobileDaoImpl implements mobileDao {

	private static Connection con = Dbutil.getConnection();

	@Override
	public void addmobile(Mobile mobile) {

		String sql = "insert into mobile_store values(?,?,?,?,?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, mobile.getBrand());
			ps.setString(2, mobile.getColor());
			ps.setString(3, mobile.getCamera());
			ps.setString(4, mobile.getRam());
			ps.setFloat(5, mobile.getPrice());
			ps.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	/*
	 * @Override public List<Mobile> updatemobile() { String sql
	 * ="update from mobile_store set ram=? where brand=?"; int status =0;
	 * PreparedStatement ps=null; try { ps=con.prepareStatement(sql);
	 * ps.setString(1,); } catch (SQLException e) {
	 * 
	 * e.printStackTrace(); }
	 * 
	 * return null; }
	 */

	@Override
	public void removemobile(Mobile mobile) {
		String sql = "delete from mobile_store where brand =?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, mobile.getBrand());
			int status = ps.executeUpdate();
			if (status == 1) {
				System.out.println("success");
			} else {
				System.out.println("failed");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	@Override
	public Mobile searchmobile(String brand) {
		String sql = "select * from mobile_store where brand =?";
		Mobile mobile = new Mobile();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, brand);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				mobile.setBrand(rs.getString(1));
				mobile.setColor(rs.getString(2));
				mobile.setCamera(rs.getString(3));
				mobile.setRam(rs.getString(4));
				mobile.setPrice(rs.getFloat(5));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return mobile;
	}

	@Override
	public void update(String brand,String brand1) {
		String sql = "UPDATE mobile_store SET brand = ? WHERE brand = ?";
	
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,brand );
			ps.setString(2, brand1);
			int status = ps.executeUpdate();
			if ( status  == 1) {
			System.out.println("Updated");
			}else {
				System.out.println("Failed");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	@Override
	public List<Mobile> displayMobiles() {
		List<Mobile> list = null;
		String sql = "select * from mobile_store";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			list = new ArrayList<Mobile>();
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Mobile mobile = new Mobile();
				mobile.setBrand(rs.getString(1));
				mobile.setColor(rs.getString(2));
				mobile.setCamera(rs.getString(3));
				mobile.setRam(rs.getString(4));
				mobile.setPrice(rs.getFloat(5));

				list.add(mobile);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

}
