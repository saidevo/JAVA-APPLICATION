package com.ResourceManagement.files.Enities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "interviewer")
public class Interviewer {
	
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY)
	@Column(name = "interviewer_id")
	private int interviewer_id;
	
	
    
	
	@Column(name = "interviewer_name")
	private String interviewer_name;
	
	
	@OneToMany(  mappedBy = "interviewr_id")
	private List<InterveiwScheduler> interveiwScheduler;
	
	

}
