package com.ResourceManagement.files.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ResourceManagement.files.Respositories.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository addressRepo;

}
