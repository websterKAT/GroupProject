package com.projectsupport.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.projectsupport.models.Supervisor;

public class SupervisorServices {
	public static void insertSupervisor(Connection conn, Supervisor supervisor) throws SQLException {
		String sql = "Insert into Supervisor (FirstName,LastName,email,mobileNo,Address,FormPath,Student_idStudent) values (?,?,?,?,?,?,?)";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1,supervisor.getFirstName());
		pstm.setString(2, supervisor.getLastName());
		pstm.setString(3,supervisor.getEmail());
		pstm.setString(4, supervisor.getMobileNo());
		pstm.setString(5, supervisor.getAddress());
		pstm.setString(6,supervisor.getAgreementForm());
		pstm.setInt(7, supervisor.getStudentId());
		pstm.executeUpdate();
		
		
	}
	
	public static Supervisor findSupervisor(Connection conn, String userId) throws SQLException {
		String sql = "Select FirstName,LastName,email,mobileNo,Address,FormPath from Supervisor where Student_idStudent= ?";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, userId);
		ResultSet rs = pstm.executeQuery();
		while(rs.next()){
			String firstName = rs.getString("FirstName");
			String lastName = rs.getString("LastName");
			String email = rs.getString("email");
			String mobileNo = rs.getString("mobileNo");
			String Address = rs.getString("Address");
			String formPath = rs.getString("FormPath");
			Supervisor supervisor = new Supervisor();
			supervisor.setFirstName(firstName);
			supervisor.setLastName(lastName);
			supervisor.setEmail(email);
			supervisor.setMobileNo(mobileNo);
			supervisor.setAddress(Address);
			supervisor.setAgreementForm(formPath);
			return supervisor;
			
		}
		return null;
	}
	
	
	public static void editSupervisor(Connection conn,Supervisor supervisor) throws SQLException{
		String sql = "update Supervisor set FirstName=?,LastName=?,email=?,mobileNo=?,Address=?,FormPath=? where Student_idStudent";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, supervisor.getFirstName());
		pstm.setString(2, supervisor.getLastName());
		pstm.setString(3, supervisor.getEmail());
		pstm.setString(4, supervisor.getMobileNo());
		pstm.setString(5, supervisor.getAddress());
		pstm.setString(6, supervisor.getAgreementForm());
		pstm.executeUpdate();
		
	}
	
	public static void deleteSupervisor(Connection conn,int userId) throws SQLException {
		String sql = "Delete from Supervisor where Student_idStudent=?";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setInt(1, userId);
		pstm.executeUpdate();
	}
	

}
