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
@Table(name="otpdetails")
@Data
public class OtpDetailsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="otp")
	private long otp;
	
	@Column(name="status")
	private boolean status;
	
	@ManyToOne
	@JoinColumn(name = "custdetails")
	private CustomerDetailsEntity customerdetails;

}
