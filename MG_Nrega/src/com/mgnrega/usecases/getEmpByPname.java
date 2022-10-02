package com.mgnrega.usecases;

import java.util.List;
import java.util.Scanner;

import com.mgnrega.bean.EmpDTO;
import com.mgnrega.dao.BdoDao;
import com.mgnrega.dao.BdoDaoImple;

public class getEmpByPname {
	
	public static void getEmplPname() {
		
		
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Project Name");
		
		String cname= sc.next();

		
		BdoDao dao = new BdoDaoImple();
		
		try {
		List<EmpDTO> dtos= dao.getAllEmployeeByPname(cname);
		
		dtos.forEach(dto -> {
			System.out.println(dto);
//			System.out.println("name "+ dto.getEname());
//			System.out.println("Day_w "+ dto.getDayworked());
//			System.out.println("Eaddress "+ dto.getEaddress());
//			System.out.println("Emobile "+ dto.getEmobile());
//			System.out.println("pname "+ dto.getPname());
//			System.out.println("Ewages "+ dto.getEwages());
			System.out.println("****************************************")
			;
		});
		
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}


