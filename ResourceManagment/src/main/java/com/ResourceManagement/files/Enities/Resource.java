package com.ResourceManagement.files.Enities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="resource")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Resource {
	
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY)
	@Column(name = "resource_id")
	private int resource_id;
	
	@NotNull(message = "Name cannot be null")
	@Size(min =1)
	@Column(name = "resource_name")
	private String resource_name;
	
	@Column(name = "registration_status")
	private boolean registration_status;
	 
	
	@OneToOne( cascade = CascadeType.ALL ,fetch = FetchType.EAGER )
	@JoinColumn(name = "address")
	
	private AddressOfResource address;
	
	
	

	

}
