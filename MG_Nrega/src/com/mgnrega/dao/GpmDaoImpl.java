package com.mgnrega.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mgnrega.bean.Employee;
import com.mgnrega.bean.Gpm;
import com.mgnrega.exceptions.GpmException;
import com.mgnrega.utility.DBUtil;

public class GpmDaoImpl implements GpmDao{

	@Override
	public Gpm loginGPM(String username, String password) throws GpmException {
	  
		Gpm gpm = null;
		
		try(Connection conn = DBUtil.provideConnection()) {
		
			PreparedStatement ps= conn.prepareStatement("select * from gpm where gemail = ? AND gpassword = ?");			
			
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs= ps.executeQuery();
		
				if(rs.next()) {
				
				int id= rs.getInt("gid");
				String n= rs.getString("gname");
				String e= rs.getString("gemail");
				String p= rs.getString("gpassword");
				String m = rs.getString("gmobile");
				String a = rs.getString("gaddress");
				int bdoid = rs.getInt("bdoid");
				
				gpm =new Gpm (id, n, e, p, m, a, bdoid);	
			
			}else
				throw new GpmException("Invalid Username or password.. ");
			
		} catch (SQLException e) {
			throw new GpmException(e.getMessage());
		}
		
		return gpm;
	}

	@Override
	public String registerEmployee(Employee employee) {
		
         String message = "Not Inserted..";
	
		try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement
					("insert into employee values(?,?,?,?,?,?)");
			
			
			ps.setInt(1, employee.getEid());
			ps.setString(2, employee.getEname());
			ps.setString(3, employee.getEmobile());
			ps.setString(4, employee.getEaddress());
			ps.setInt(5, employee.getDayworked());
			ps.setString(6, employee.getEwages());
			
			int x= ps.executeUpdate();
			
			if(x > 0)
				message = "Employee Registered Sucessfully !";
		
		} catch (SQLException e) {
			message = e.getMessage();
		}
	
		return message;
	}

}
