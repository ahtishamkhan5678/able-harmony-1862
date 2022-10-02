package com.mgnrega.usecases;

import java.util.Scanner;

import com.mgnrega.bean.Employee;
import com.mgnrega.bean.Gpm;
import com.mgnrega.dao.BdoDao;
import com.mgnrega.dao.BdoDaoImple;
import com.mgnrega.dao.GpmDao;
import com.mgnrega.dao.GpmDaoImpl;

public class RegisterEmployee {
	public static void REmployee() {
	     Scanner sc= new Scanner(System.in);
	     
	     
	       	System.out.println("Enter Employee id:");
			int id= sc.nextInt();
			
			System.out.println("Enter Employee  Name:");
			String name= sc.next();
			
			System.out.println("Enter Employee  phone:");
			String phone= sc.next();
			
			System.out.println("Enter Employee  address:");
			String address= sc.next();
			
			System.out.println("Enter Employee  totaldaywork:");
			int daywork= sc.nextInt();  
			
			System.out.println("Enter Employee wages:");
			String wages= sc.next();
			
			
			BdoDao dao=new BdoDaoImple();
			
			
			
			Employee emp= new Employee(id, name, phone, address, daywork, wages);
			
			GpmDao gdaao= new GpmDaoImpl();
			String result=gdaao.registerEmployee(emp);
		
		

			
			
			System.out.println(result);
	}

}
