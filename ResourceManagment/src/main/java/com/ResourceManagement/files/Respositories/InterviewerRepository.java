package com.ResourceManagement.files.Respositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.ResourceManagement.files.Enities.Interviewer;
import com.ResourceManagement.files.Enities.Regestration;



public interface InterviewerRepository extends JpaRepository <Interviewer,Integer> {

}