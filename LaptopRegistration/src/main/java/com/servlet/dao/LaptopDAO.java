package com.servlet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.servlet.config.DatabaseConfig;
import com.servlet.elements.LaptopDetails;

public class LaptopDAO {
	public void insertLaptopDetail(LaptopDetails de) {

		String query = "insert into Info values(?,?,?,?,?,?,?,?)";

		try {
			// creation a connection by calling a method from class Connection provider
			Connection con = DatabaseConfig.getConnection();
			PreparedStatement ps = con.prepareStatement(query);

			ps.setString(1, de.getLaptopName());
			ps.setString(2, de.getLaptopBrand());
			ps.setString(3, de.getLaptopPrice());
			ps.setString(4, de.getTouchScreen());
			ps.setString(5, de.getFastCharging());
			ps.setString(6, de.getProcessor());
			ps.setString(7, de.getRamSize());
			ps.setString(8, de.getStorageCapacity());

			int i = ps.executeUpdate();
			ps.close();
			System.out.println("PreparedStatement is closed ");

			DatabaseConfig.closeConnection();
			if (i > 0) {
				System.out.print("Data Entered Sucessfully");
			} else {
				System.out.print("failed to enter Data");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<LaptopDetails> getLaptopDetails() {
		List<LaptopDetails> list = null;
		try {
			list = new ArrayList<LaptopDetails>();
			String sql = "select * from Info";
			PreparedStatement ps = DatabaseConfig.getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				LaptopDetails de = new LaptopDetails();
				de.setLaptopName(rs.getString(1));
				de.setLaptopBrand(rs.getString(2));
				de.setLaptopPrice(rs.getString(3));
				de.setTouchScreen(rs.getString(4));
				de.setFastCharging(rs.getString(5));
				de.setProcessor(rs.getString(6));
				de.setRamSize(rs.getString(7));
				de.setStorageCapacity(rs.getString(8));
				list.add(de);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;

	}

	public List<LaptopDetails> searchLaptopDetails(String laptopName) throws SQLException {
		System.out.println("invoked");
		System.out.println("LaptopName =" + laptopName);
		List<LaptopDetails> list = new ArrayList<LaptopDetails>();
		try {
			System.out.println("inside try ");
			PreparedStatement ps = DatabaseConfig.getConnection()
					.prepareStatement("SELECT * FROM information.Info WHERE laptop_name=?");
			ps.setString(1, laptopName);
			System.out.println(ps);
			ResultSet rs = ps.executeQuery();
			System.out.println("ResultSet = " + rs);
			while (rs.next()) {
				System.out.println("inside while");
				LaptopDetails de = new LaptopDetails();
				de.setLaptopName(rs.getString(1));
				System.out.println("rs.getString(1)"+ rs.getString(1));
				de.setLaptopBrand(rs.getString(2));
				System.out.println("rs.getString(2)"+ rs.getString(2));
				de.setLaptopPrice(rs.getString(3));
				de.setTouchScreen(rs.getString(4));
				de.setFastCharging(rs.getString(5));
				de.setProcessor(rs.getString(6));
				de.setRamSize(rs.getString(7));
				de.setStorageCapacity(rs.getString(8));
				list.add(de);

			}

		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		return list;
	}
	
    public boolean delete(String laptopName){
    boolean rowDeleted=false;;
    try {
        Connection con = DatabaseConfig.getConnection();
        // delete query is given to delete the record for
        PreparedStatement ps = con.prepareStatement("delete from Info where laptop_name=?");
        ps.setString(1,laptopName);
        rowDeleted= ps.executeUpdate()>0;
    }
    catch (Exception e) {
        e.printStackTrace();
    }return rowDeleted;
}
}

