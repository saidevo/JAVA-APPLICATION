package com.ResourceManagement.files.Controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ResourceManagement.files.Enities.InterveiwScheduler;
import com.ResourceManagement.files.Enities.Interviewer;
import com.ResourceManagement.files.Respositories.InterveiwSchedulerRepo;
import com.ResourceManagement.files.Service.InterveiwSchedulerRepService;

@RestController
@RequestMapping("/interview_scheduler")
public class InterveiwSchedulerController {
	
	@Autowired
	private InterveiwSchedulerRepService intervSchedulerRepo;
	
	
	@PostMapping("/{resource_id}/{panel_id}")
	public ResponseEntity<Map<String,InterveiwScheduler> > addInterviewer(@PathVariable int resource_id , @PathVariable int panel_id ){
		
		
		Map<String,InterveiwScheduler>  map = intervSchedulerRepo.addScheduler(resource_id, panel_id);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(map);
		
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<InterveiwScheduler>> getInterviewer( ){
		
		List<InterveiwScheduler>  l = intervSchedulerRepo.getSchudeler();
		
		System.out.println(l);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(l);
		
	}
	

}
