package com.mgnrega.usecases;

import java.util.Scanner;

import com.mgnrega.bean.Bdo;
import com.mgnrega.bean.Project;
import com.mgnrega.dao.BdoDao;
import com.mgnrega.dao.BdoDaoImple;
import com.mgnrega.exceptions.BDOException;

public class CreateProject {
	
    public static void CProject() {
		
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter Project name:");
	String pname= sc.next();
		
		System.out.println("Enter Project id:");
		int pid= sc.nextInt();
		
	
		
		System.out.println("Enter Project cost:");
		String cost= sc.next();
		
		System.out.println("Enter Project issuedate:");
		String issuedate= sc.next();
		
		
		BdoDao dao=new BdoDaoImple();
		
		
		
		Project project= new Project();
		
		project.setPid(pid);
		project.setPname(pname);
		project.setPcost(cost);
		project.setPissuedate(issuedate);
	

		String result= dao.createProject(pid, pname, cost, issuedate);
		
		System.out.println(result);
	}
	}	


