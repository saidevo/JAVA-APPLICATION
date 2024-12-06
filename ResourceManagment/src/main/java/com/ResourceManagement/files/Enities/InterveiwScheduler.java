package com.ResourceManagement.files.Enities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "interview_sheduler")
public class InterveiwScheduler {
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	
	
	
	@OneToOne( cascade = CascadeType.ALL , fetch = FetchType.EAGER )
	@JoinColumn(name = "resource_id")
	private Resource resource_id;
	
	
	@ManyToOne(targetEntity=Interviewer.class, cascade = CascadeType.ALL ,fetch= FetchType.EAGER)
	@JoinColumn(name = "interviewr_id")
	@JsonIgnore
	private Interviewer interviewr_id;
	
	
	

}
