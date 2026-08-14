package com.dco.digitalcustomeronboarding.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="address")
@Data
public class AddressEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="currentaddress")
	private String currentAddress;
	
	@Column(name="permanaentaddress")
	private String permanaentAddress;
	
	@Column(name="pincode")
	private long pincode;
	
	@ManyToOne
	@JoinColumn(name = "countryid")
	private CountryEntity country;
	
	@ManyToOne
	@JoinColumn(name="stateid")
	private StateEntity state;
	
	@ManyToOne
	@JoinColumn(name="cityid")
	private CityEntity city;
	
	@ManyToOne
	@JoinColumn(name = "custid")
	private CustomerDetailsEntity customerdetails;
	
	

}
