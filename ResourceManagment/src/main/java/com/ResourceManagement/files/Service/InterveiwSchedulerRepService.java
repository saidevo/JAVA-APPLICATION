package com.ResourceManagement.files.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ResourceManagement.files.Enities.InterveiwScheduler;
import com.ResourceManagement.files.Enities.Interviewer;
import com.ResourceManagement.files.Enities.Resource;
import com.ResourceManagement.files.Respositories.InterveiwSchedulerRepo;
import com.ResourceManagement.files.Respositories.InterviewerRepository;
import com.ResourceManagement.files.Respositories.ResourceRespository;

import jakarta.transaction.Transactional;

@Service
public class InterveiwSchedulerRepService  {
	
	@Autowired
	private InterveiwSchedulerRepo interviewShedulerRepo;
	
	@Autowired
	private ResourceRespository resourceRepo;
	
	@Autowired
	private InterviewerRepository intRepo;
	
	
	@Transactional
	public List<InterveiwScheduler> getSchudeler(){
		return interviewShedulerRepo.findAll();
	}
	
	public Map<String,InterveiwScheduler> addScheduler(int resource_id , int panel_id) {
		
		
		Map<String,InterveiwScheduler> map = new HashMap<>();
		InterveiwScheduler is = new InterveiwScheduler();
		
		String msg = "";
	

		
		
		
		
		
		try {
			
			Interviewer i = intRepo.findById(panel_id).get();
			Resource r = resourceRepo.findById(resource_id).get();
			is.setResource_id(r);
			is.setInterviewr_id(i);
			
			
			
			is.setResource_id(r);
			
			msg  = "schdule was created";
			
			InterveiwScheduler is2 = interviewShedulerRepo.save(is);
			map.put(msg, is2);
			
			return map;
			
		}
		catch(Exception e) {
			
			msg  = "schduler not created";
			map.put(msg, is);
			return map;
			
		}
		
		
		
			}

}
