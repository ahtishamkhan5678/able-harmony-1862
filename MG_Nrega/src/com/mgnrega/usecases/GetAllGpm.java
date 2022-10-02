package com.mgnrega.usecases;

import java.util.List;

import com.mgnrega.bean.Gpm;
import com.mgnrega.dao.BdoDao;
import com.mgnrega.dao.BdoDaoImple;
import com.mgnrega.exceptions.GpmException;

public class GetAllGpm {
	
	public static void GAllGpm()  {
		
		BdoDao dao=new BdoDaoImple();
		
		try {
			List<Gpm> gpm=dao.getAllGPM();
			 
			gpm.forEach(s->{
				
				System.out.println("************************************");
				
				System.out.println("Grampchyat member name: "+s.getGname());
				System.out.println("Grampchyat member email: "+s.getGemail());
				System.out.println("Grampchyat member Password: "+s.getGpassword());
				System.out.println("Grampchyat member Mobile:   "+s.getGmobile());
				
				System.out.println("Grampchyat member Address:  "+s.getGaddress());
				
				System.out.println("************************************");
			});
			
		} catch (GpmException e) {
		     System.out.println(e.getMessage());
		}
		
	}

}
