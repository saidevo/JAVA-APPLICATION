package com.ResourceManagement.files.Respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ResourceManagement.files.Enities.Resource;

@Repository

public interface ResourceRespository  extends JpaRepository<Resource,Integer> {
	
	 @Query("SELECT r FROM Resource r WHERE r.resource_name = :name")
	 Resource findByName( @Param(value = "name")  String resource_name);

}
