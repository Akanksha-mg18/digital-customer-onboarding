package com.dco.digitalcustomeronboarding.controller;

import com.dco.digitalcustomeronboarding.dto.ApiResponse;
import com.dco.digitalcustomeronboarding.entity.CustomerDetailsEntity;
import com.dco.digitalcustomeronboarding.service.CustomerDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/customerdetails")
public class CustomerDetailsController {

    @Autowired
    CustomerDetailsService customerDetailsService;
    @PostMapping("/customerregistration")
    public ResponseEntity<ApiResponse<CustomerDetailsEntity>>savecustomerDetails(
            @RequestBody CustomerDetailsEntity customerDetailsEntity){
        boolean checkuser = customerDetailsService.checkuser(customerDetailsEntity);
        if(checkuser){
            return new ResponseEntity(checkuser,HttpStatus.BAD_REQUEST);       }
        else{
            customerDetailsService.saveCustomerDetails(customerDetailsEntity);
        }
        customerDetailsService.saveCustomerDetails(customerDetailsEntity);
        ApiResponse<CustomerDetailsEntity> response = ApiResponse.success("Customer Details Saved Successfully");
        return new ResponseEntity(response,HttpStatus.OK);

    }
    @PutMapping("/update-customer")
    public ResponseEntity<ApiResponse <CustomerDetailsEntity>>updateCust(
            @RequestBody CustomerDetailsEntity customerDetailsEntity){
        log.info("Customer Details Update"+ customerDetailsEntity);
        customerDetailsService.updateCust(customerDetailsEntity);
        ApiResponse<CustomerDetailsEntity> response = ApiResponse.success("Customer Details Update Successfully");

        return new ResponseEntity(response,HttpStatus.OK);
    }

}
