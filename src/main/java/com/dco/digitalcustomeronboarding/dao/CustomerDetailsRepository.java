package com.dco.digitalcustomeronboarding.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dco.digitalcustomeronboarding.entity.CustomerDetailsEntity;

import java.util.Optional;

@Repository
public interface CustomerDetailsRepository extends JpaRepository<CustomerDetailsEntity, Long> {

    CustomerDetailsEntity findBymobilenumber(String mobileNumber);
    CustomerDetailsEntity findBypancardno(String pancardno);
    CustomerDetailsEntity findByemail(String email);
}

