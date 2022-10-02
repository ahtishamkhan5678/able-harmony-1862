package com.mgnrega.dao;

import com.mgnrega.bean.Employee;
import com.mgnrega.bean.Gpm;
import com.mgnrega.exceptions.GpmException;

public interface GpmDao {
	
    public Gpm loginGPM(String username, String password)throws GpmException;
    
	public String registerEmployee(Employee employee);
//
//	public List<Employee> getAllGPM()throws EmployeeException;
//	
//	public String registerEmployeeToProject(int pid, int eid)throws ProjectException, EmployeeException ;
//
//
//	public EmployeeDTO getEmployeeByMobile(String emobile)throws ProjectException;


}
