package com.ResourceManagement.files.Respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ResourceManagement.files.Enities.InterveiwScheduler;


@Repository
public interface InterveiwSchedulerRepo extends JpaRepository<InterveiwScheduler,Integer> {

}
