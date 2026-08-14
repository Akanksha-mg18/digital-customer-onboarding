package com.dco.digitalcustomeronboarding.ServiceImpl;

import com.dco.digitalcustomeronboarding.dao.AddressRepository;
import com.dco.digitalcustomeronboarding.entity.AddressEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dco.digitalcustomeronboarding.service.AddressService;

@Component
public class AddressServiceImpl  implements AddressService{

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public void saveAddress(AddressEntity addressEntity) {
        addressRepository.save(addressEntity);

    }
}
