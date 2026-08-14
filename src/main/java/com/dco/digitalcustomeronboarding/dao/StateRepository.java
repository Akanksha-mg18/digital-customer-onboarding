package com.dco.digitalcustomeronboarding.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dco.digitalcustomeronboarding.entity.StateEntity;

@Repository
public interface StateRepository extends JpaRepository<StateEntity, Long> {

}
