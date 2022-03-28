package com.example.TrantorTraining.service;

import com.example.TrantorTraining.dto.CustomerDto;
import com.example.TrantorTraining.entity.Customer;

import java.util.Optional;

public interface CustomerServiceInterface {

    Optional<Customer> getCustomer(Integer id);
    Customer saveCustomer(CustomerDto customerDto);

}
