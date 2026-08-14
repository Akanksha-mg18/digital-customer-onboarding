package com.dco.digitalcustomeronboarding.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name ="country")
@Data
public class CountryEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "countryname")
	private String countryName;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "country")
	private List<StateEntity> stateEntities;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "country")
	private List<AddressEntity> address;

}
