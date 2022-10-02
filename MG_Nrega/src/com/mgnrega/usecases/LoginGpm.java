package com.mgnrega.usecases;
import java.util.Scanner;
import com.mgnrega.bean.Gpm;
import com.mgnrega.dao.GpmDao;
import com.mgnrega.dao.GpmDaoImpl;
import com.mgnrega.exceptions.GpmException;
import com.mgnrega.login.UserActivity;

public class LoginGpm {
	
	
	public static void  LGpm() {
		
	Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Username:");
		String uname = sc.next();
		
		System.out.println("Enter Password:");
		String pass = sc.next();
		if(uname.equals("ahtisham@567") && pass.equals("ahtisham567")) {
			System.out.println(" login successful");
			UserActivity.gpm();
		}else {
			System.out.println("Username or password are wrong try again");
			
		}	
	
	}
}
