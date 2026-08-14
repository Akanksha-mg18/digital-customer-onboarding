package com.dco.digitalcustomeronboarding.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dco.digitalcustomeronboarding.entity.OtpDetailsEntity;

@Repository
public interface OtpDetailsRepository extends JpaRepository<OtpDetailsEntity, Long> {

}
