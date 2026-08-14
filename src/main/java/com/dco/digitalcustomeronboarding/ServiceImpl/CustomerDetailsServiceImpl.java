package com.dco.digitalcustomeronboarding.ServiceImpl;

import com.dco.digitalcustomeronboarding.dao.CustomerDetailsRepository;
import com.dco.digitalcustomeronboarding.entity.CustomerDetailsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dco.digitalcustomeronboarding.service.CustomerDetailsService;

@Component
public class CustomerDetailsServiceImpl implements CustomerDetailsService {

    @Autowired
    private CustomerDetailsRepository customerDetailsRepository;

    @Override
    public boolean checkuser(CustomerDetailsEntity customerDetailsEntity) {
        boolean isuserexist = false;
        if(customerDetailsRepository.findBymobilenumber(customerDetailsEntity.getMobilenumber()) != null){
            isuserexist = true;
        } else if (customerDetailsRepository.findByemail(customerDetailsEntity.getEmail()) != null) {
            isuserexist = true;
        } else if (customerDetailsRepository.findBypancardno(customerDetailsEntity.getPancardno()) != null) {
            isuserexist = true;
        }
        return isuserexist;
    }

    @Override
    public void updateCust(CustomerDetailsEntity customerDetailsEntity) {
        customerDetailsRepository.save(customerDetailsEntity);
    }

    @Override
    public void saveCustomerDetails(CustomerDetailsEntity customerDetailsEntity) {
        customerDetailsRepository.save(customerDetailsEntity);

    }


}
