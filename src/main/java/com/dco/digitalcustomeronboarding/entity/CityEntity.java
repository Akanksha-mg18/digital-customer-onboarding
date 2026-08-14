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
@Table(name="city")
@Data
public class CityEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="cityname")
	private String cityname;
	
	@ManyToOne
	@JoinColumn(name="stateid")
	private StateEntity state;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "city")
	private List<AddressEntity> address;

}

