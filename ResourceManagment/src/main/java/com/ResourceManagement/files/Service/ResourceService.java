package com.ResourceManagement.files.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ResourceManagement.files.Enities.Regestration;
import com.ResourceManagement.files.Enities.Resource;
import com.ResourceManagement.files.Respositories.ResourceRespository;

@Service
public class ResourceService {
	
	@Autowired
	private ResourceRespository resourceRepo;
	
	@Autowired
	private ResgistrationServices regService;
	
	public Map<String, Resource> addResource( Resource r) {
		
		resourceRepo.save(r);
		
		Map<String, Resource> map = new HashMap();
		
		String msg = "";
		
		boolean isRegistered = r.isRegistration_status();
		
		if(isRegistered) {
			
			msg = regService.userRegistration(r);
			
		}
		else {
			msg = "user created without registration";
		}
		
		
		map.put(msg, r);
		
		
		return map;
	}
	
	public List<Resource> getResource(){
		List<Resource> list = resourceRepo.findAll();
		
		return list;
	}
	
	public Resource getResourceWithId(int id) {
		return resourceRepo.findById(id).get();
	}
   
	public Resource findByName(String name) {
		
		Resource r = resourceRepo.findByName(name);
		return r;
	}
	
	
	

}
