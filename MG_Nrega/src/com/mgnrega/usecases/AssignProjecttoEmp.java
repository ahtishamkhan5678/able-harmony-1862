package com.mgnrega.usecases;

import java.util.Scanner;

import com.mgnrega.dao.BdoDao;
import com.mgnrega.dao.BdoDaoImple;
import com.mgnrega.exceptions.EmployeeException;
import com.mgnrega.exceptions.ProjectException;

public class AssignProjecttoEmp {
  public static void AProjecttoEmp() {
	  Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Project id");
		int pd=sc.nextInt();
		
		System.out.println("Enter the Employee id");
		int ed=sc.nextInt();
		
	
		
		try {

			BdoDao bd= new BdoDaoImple();
	
		try {
			String rs = bd.AssignProjectToEmployeee(pd, ed);
			System.out.println(rs);
		} catch (ProjectException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
