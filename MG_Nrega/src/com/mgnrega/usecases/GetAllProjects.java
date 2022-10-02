package com.mgnrega.usecases;

import java.util.List;

import com.mgnrega.bean.Project;
import com.mgnrega.dao.BdoDao;
import com.mgnrega.dao.BdoDaoImple;
import com.mgnrega.exceptions.ProjectException;

public class GetAllProjects {
	
	public static void GAllProjects() {
		
		BdoDao dao = new BdoDaoImple();
		
		try {
			List<Project> projects=dao.getAllProjectDetails();
			projects.forEach(s->{
				System.out.println("==========================================");
				
				System.out.println("Project Name :"+s.getPname());
				System.out.println("Project cost: "+s.getPcost());
				System.out.println("Project issuedate: "+s.getPissuedate());
				
				System.out.println("==========================================");
			});
		} catch (ProjectException e) {
			System.out.println(e.getMessage());
		}
	
		
	}

}
