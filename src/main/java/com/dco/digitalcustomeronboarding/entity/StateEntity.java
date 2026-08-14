package com.dco.digitalcustomeronboarding.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="state")
@Data
public class StateEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="statename")
	private String stateName;
	
	@ManyToOne
	@JoinColumn(name = "countryid")
	private CountryEntity country;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "state")
	private List<CityEntity> city;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "state")
	private List<AddressEntity> address;
	
	

}

