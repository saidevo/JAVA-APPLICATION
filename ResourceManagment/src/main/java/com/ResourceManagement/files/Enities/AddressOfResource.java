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
@Table(name = "address")
public class AddressOfResource {
	
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	
	
	
	@Column(name = "city_name")
	private String city_name;
	 
	
	

}
