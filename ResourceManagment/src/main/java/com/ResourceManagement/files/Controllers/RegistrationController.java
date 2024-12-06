package com.ResourceManagement.files.Controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ResourceManagement.files.Service.ResgistrationServices;

@RestController
@RequestMapping("/registraion")
public class RegistrationController {
	
	@Autowired
	private ResgistrationServices regSerivces;
	
	
	
	
	@PostMapping("/{id}")
	private  ResponseEntity<Map<String,String>> registation(@PathVariable int id) {
		
		String msg = regSerivces.userReg(id);
		Map<String, String> map = new HashMap<>();
		map.put("message", msg);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(map);
		
	}

}
