package com.mgnrega.login;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.mgnrega.*;
import com.mgnrega.usecases.AssignProjecttoEmp;
import com.mgnrega.usecases.CreateProject;
import com.mgnrega.usecases.GetAllGpm;
import com.mgnrega.usecases.GetAllProjects;
import com.mgnrega.usecases.LoginGpm;
import com.mgnrega.usecases.RegisterEmployee;
import com.mgnrega.usecases.RegisterGpm;
import com.mgnrega.usecases.getEmpByPname;
//import com.usecases.AddNewCourse;
//import com.usecases.AllocateStudentCourse;
//import com.usecases.CreateBatch;
//import com.usecases.DeleteCourseByCourseName;
//import com.usecases.GetAllCourse;
//import com.usecases.GetAllStudentOfEveryBatch;
//import com.usecases.RegisterStudent;
//import com.usecases.SearchCourseByCourseId;
//import com.usecases.UpdateFeeByCourseId;
//import com.usecases.UpdateSeatByBatchId;
//import com.usecases.UpdateStudentDetails;

public class UserActivity {
	public static void selectUser() {

		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out
				.println("Choose an options - \n" + "1. BDO Login\n" + "2. GPM Login\n");

		System.out.println();
		System.out.println("Enter any number from above: ");

		int choice = 0;
		try {
			choice = sc.nextInt();
		} catch (InputMismatchException e) {

			System.out.println("Invalid input!");

			System.out.println();
			System.out.println("Try again...");

			UserActivity.selectUser();
		}

		switch (choice) {
		case 1:
			System.out.println("Enter bdo username");
			String username=sc.next();
			System.out.println("Enter bdo password");
			String password=sc.next();
			if(username.equals("ahtisham@567") && password.equals("ahtisham567")) {
				System.out.println("BDO login successful");
				UserActivity.bdo();
			}else {
				System.out.println("Username or password are wrong try again");
				UserActivity.selectUser();
			}
			
			break;
		case 2:
			UserActivity.gpm();
			break;
		default:
			System.out.println("Invalid choice!");
			System.out.println();

			System.out.println("Try again...");
			UserActivity.selectUser();
		}
	}

	public static void bdo() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1.  Create a project\r\n"
				+ "         2.  View List Of Project.\r\n"
				+ "         3. Create new Gram Panchayat Member(GPM).\r\n"
				+ "         4. View all the GPM.\r\n"
				+ "         5. Allocate  Project to GPM.\r\n"
			
				+ "         6. Go Back");
		
		System.out.println();
		System.out.println("Enter any number from above which you want to operate");
		
		int c=0;
		
		try {
			c=sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("Invalid input!");
			System.out.println("Try again....");
			UserActivity.bdo();
		}
		
		switch(c) {
		case 1:
		     CreateProject.CProject();
			break;
		case 2:
            GetAllProjects.GAllProjects();			
			break;
		case 3:
			RegisterGpm.RGpm();
			break;
		case 4:
		GetAllGpm.GAllGpm();
			break;
		case 5:
			AssignProjecttoEmp.AProjecttoEmp();
			break;
//		case 6:
//			getEmpByPname.getEmplPname();
//			break;
	
		case 6:
			UserActivity.selectUser();
		}
		
		UserActivity.bdo();
			
	
		}
	public static void gpm() {
		Scanner sc=new Scanner(System.in);
		System.out.println("	1. Register himself in a GPM with a username and password (email should be the username)\r\n"
				         + "    2. Register Employee\r\n"
				         + "    3. See List of Employee working on that Project on Name\r\n"
				         + "    4. Go back");
		
		System.out.println();
		System.out.println("Enter any number from above which you want to operate");
		int c=0;
		
		try {
			c=sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("Invalid input!");
			System.out.println("Try again....");
			UserActivity.gpm();
		}
		
		switch(c) {
		case 1:
			LoginGpm.LGpm();
			
			break;
		case 2:
			RegisterEmployee.REmployee();
		
			break;
	
			
		case 3:
			getEmpByPname.getEmplPname();
			break;
		
		
		case 4:
			UserActivity.selectUser();;
			break;
		}
		
		UserActivity.gpm();
		
	}
}
