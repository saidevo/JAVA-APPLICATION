package com.ResourceManagement.files.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ResourceManagement.files.Enities.Interviewer;
import com.ResourceManagement.files.Service.InterviewrService;

@RestController
@RequestMapping("/interviewer")
public class InterviewerContoller {
	
	@Autowired
	private InterviewrService intervService;
	
	
	@PostMapping("/create")
	public ResponseEntity<Interviewer> addInt(@RequestBody Interviewer i) { 
		
		System.out.println( "object" + i);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(intervService.addInt(i));
		
	}
	
	@GetMapping("/get_Interviews_By_interviewer")
    public ResponseEntity<List<Interviewer>> getInt() { 
		
		List<Interviewer> li = intervService.getInt();
		
		return ResponseEntity.status(HttpStatus.OK).body(li);
		
	}
	
	

}
