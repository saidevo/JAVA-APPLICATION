package com.ResourceManagement.files.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ResourceManagement.files.Enities.Regestration;
import com.ResourceManagement.files.Enities.Resource;
import com.ResourceManagement.files.Respositories.RegestrationRepository;
import com.ResourceManagement.files.Respositories.ResourceRespository;


@Service
public class ResgistrationServices {
	
	@Autowired
	private RegestrationRepository regRepo;
	
	@Autowired
	private ResourceRespository resourceRepo;
	
	
	public String userRegistration(Resource  r) {
		
		
		Regestration rg = new Regestration();
		rg.setResource_id(r);
		
		Regestration rg2 = regRepo.save(rg);
	    
	    return "user saved with registration";
	}



	public String userReg(int id) {
		
		
		String msg = "";
		try {
			Resource r = resourceRepo.findById(id).get();
			r.setRegistration_status(true);
			msg = userRegistration(r) + "with id....." + id;
			
		}
		catch(Exception e) {
			msg = "user not found with matched.........." + id;
			
		}
		
		return msg;
		
	}
	
	

}
