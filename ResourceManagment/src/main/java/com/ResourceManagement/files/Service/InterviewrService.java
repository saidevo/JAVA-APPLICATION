package com.ResourceManagement.files.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ResourceManagement.files.Enities.Interviewer;
import com.ResourceManagement.files.Respositories.InterviewerRepository;
import com.ResourceManagement.files.Respositories.RegestrationRepository;

import java.util.*;
@Service
public class InterviewrService {
	
	@Autowired
	private InterviewerRepository intRepo;
	
	public Interviewer addInt(Interviewer i) {
		Interviewer i1 = intRepo.save(i);
		return i1;
	}

	public List<Interviewer> getInt() {
		
		
		List<Interviewer> li = intRepo.findAll();
		return li;
	}

}