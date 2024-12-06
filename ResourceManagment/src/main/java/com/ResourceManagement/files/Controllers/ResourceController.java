package com.ResourceManagement.files.Controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import com.ResourceManagement.files.Enities.Resource;
import com.ResourceManagement.files.Service.ResourceService;

import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
class ResourceDao{
	
	private int id;
	private String resource_name;
	private int address_id;
}

@RestController
@RequestMapping("/resource")
public class ResourceController {
  
	
	@Autowired
	private ResourceService  resourceService;
	
	
	
	@GetMapping("/get_by_name/{name}")
	public ResponseEntity<Resource> getResource(@PathVariable String name){
		
		return ResponseEntity.status(HttpStatus.OK).body(resourceService.findByName(name));
	}
	
	
	@PostMapping("/post")
	public ResponseEntity<Map<String, Resource> > addResource(@RequestBody Resource r) {
		
		
		Map<String, Resource> res = resourceService.addResource(r);
		
		return  ResponseEntity.status( HttpStatus.CREATED).body(res );
	}
	
	
	@GetMapping("/get_withaddressid")
	public ResponseEntity<List<ResourceDao>> getResource(){
		List<Resource> l = resourceService.getResource();
		List<ResourceDao> l1 = new ArrayList();
		
		Stream<Resource> s = l.stream();
		s.forEach(
				
				r -> {
					ResourceDao	resourc = new ResourceDao( r.getResource_id(),r.getResource_name(),r.getAddress().getId()  );
					l1.add(resourc);
				}
				
		);
		
		
		
		return  ResponseEntity.status(HttpStatus.OK).body( l1);
	}
	
	
	@GetMapping("/get_with_address")
	public ResponseEntity<List<Resource>> getResourceWithAddress(){
		List<Resource> l = resourceService.getResource();
		System.out.println(l);
		
		return  ResponseEntity.status(HttpStatus.OK).body( l);
	}
	
	@GetMapping("/get_with_id/{id}")
	public ResponseEntity<Resource> getResourceWithIdWithAddress( @PathVariable int id ){
		Resource l = resourceService.getResourceWithId(id);
		
		
		return  ResponseEntity.status(HttpStatus.OK).body( l);
	}
	
	@GetMapping("/get_with_id_withAddId/{id}")
	public ResponseEntity<ResourceDao> getResourceWithIdWithAddressId( @PathVariable int id ){
		Resource r = resourceService.getResourceWithId(id);
		ResourceDao l = new ResourceDao( r.getResource_id(),r.getResource_name(),r.getAddress().getId()  );
		
		
		return  ResponseEntity.status(HttpStatus.OK).body( l);
	}
	
	
	
}
