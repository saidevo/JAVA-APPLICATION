package com.ResourceManagement.files.Enities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
@Table(name = "registration")
public class Regestration{
	
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	
	@OneToOne(  cascade = CascadeType.ALL)
	@JoinColumn( name = "resource")
	private Resource resource_id;
	
	
	

}
