package com.dco.digitalcustomeronboarding.service;

import com.dco.digitalcustomeronboarding.entity.CustomerDetailsEntity;
import org.springframework.stereotype.Service;

@Service
public interface CustomerDetailsService {
    public void saveCustomerDetails(CustomerDetailsEntity customerDetailsEntity);

    public boolean checkuser(CustomerDetailsEntity customerDetailsEntity);
    public void updateCust(CustomerDetailsEntity customerDetailsEntity);


}
