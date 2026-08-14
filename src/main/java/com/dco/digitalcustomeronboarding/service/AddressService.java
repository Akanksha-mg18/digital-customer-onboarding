package com.dco.digitalcustomeronboarding.service;

import com.dco.digitalcustomeronboarding.entity.AddressEntity;
import org.springframework.stereotype.Service;

@Service
public interface AddressService {
    public void saveAddress(AddressEntity addressEntity);

}
