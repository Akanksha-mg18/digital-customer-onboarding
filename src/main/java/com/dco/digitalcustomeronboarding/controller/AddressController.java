package com.dco.digitalcustomeronboarding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dco.digitalcustomeronboarding.dto.ApiResponse;
import com.dco.digitalcustomeronboarding.entity.AddressEntity;
import com.dco.digitalcustomeronboarding.service.AddressService;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/address")
public class AddressController {
    @Autowired
    AddressService addressService;

    @PostMapping("/addressdetails")
    public ResponseEntity<ApiResponse<AddressEntity>> saveAddress(
            @RequestBody AddressEntity addressEntity){
        log.info("Address Details Successfully Using Address Entity");
    	addressService.saveAddress(addressEntity);
        ApiResponse<AddressEntity> response = ApiResponse.success("Address Details Saved Successfully");
        return ResponseEntity.ok(response);

    }

}
