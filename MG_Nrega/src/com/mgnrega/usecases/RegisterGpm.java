package com.mgnrega.usecases;

import java.util.Scanner;

import com.mgnrega.bean.Gpm;
import com.mgnrega.dao.BdoDao;
import com.mgnrega.dao.BdoDaoImple;

public class RegisterGpm {
	
	public static void RGpm() {
		
           Scanner sc= new Scanner(System.in);
       	System.out.println("Enter Grampachyat member id:");
		int id= sc.nextInt();
		
		System.out.println("Enter Grampachyat member Name:");
		String name= sc.next();
		
		
		
		System.out.println("Enter Grampachyat member Email:");
		String email= sc.next();
		
		System.out.println("Enter Grampachyat member password:");
		String password= sc.next();
		
		System.out.println("Enter Grampachyat member phone:");
		String phone= sc.next();
		
		System.out.println("Enter Grampachyat member address:");
		String address= sc.next();

		
		
		BdoDao dao=new BdoDaoImple();
		
		
		
		Gpm mem= new Gpm();
		
		mem.setGid(id);
		mem.setGname(name);
		mem.setGemail(email);
		mem.setGpassword(password);
		mem.setGmobile(phone);
		mem.setGaddress(address);
		
		

		String result= dao.registerGPM(mem);
		
		System.out.println(result);
	}
}


