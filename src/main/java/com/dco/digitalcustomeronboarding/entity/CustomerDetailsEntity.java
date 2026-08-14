package com.dco.digitalcustomeronboarding.entity;

import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

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
@Table(name="customer_details")
@Data

public class CustomerDetailsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="name" ,length=100, nullable = false)
	private String name;
	
	@Column(name="middlename" ,length=100, nullable = false)
	private String middlename;
	
	@Column(name="surname" ,length=100, nullable = false)
	private String surname;
	
	@Column(name = "dob")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-mm-yyyy")
	private Date dob;
	
	@Column(name= "mobilenumber",unique = true)
	private String mobilenumber;
	
	@Column(name= "email",unique = true)
	private String email;
	
	@Column(name= "pancardno",unique = true)
	private String pancardno;
	
	@Column(name= "status")
	private boolean status;
	
	@Column(name= "adharcarddocs")
	private String adharcarddocs;
	
	@Column(name= "pancarddocs")
	private String pancarddocs;
	
	@Column(name= "addressverificationdocs")
	private String addressVerificationDocs;
	
	@Column(name= "signature")
	private String signature;
	
	@Column(name= "ismobileotpvalidated")
	private boolean isMobileOtpValidated;
	
	@Column(name= "isemailotpvalidated")
	private boolean isEmailOtpValidated;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "customerdetails")
	private List<OtpDetailsEntity> otpdetails;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "customerdetails")
	private List<AddressEntity> address;
	
	
	

}
