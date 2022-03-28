package com.example.TrantorTraining.service;

import com.example.TrantorTraining.dto.CustomerDto;
import com.example.TrantorTraining.entity.Customer;
import com.example.TrantorTraining.mapper.mapper;
import com.example.TrantorTraining.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerSerivce implements CustomerServiceInterface{


    @Autowired
    private CustomerRepo customerRepo;

    public Optional<Customer> getCustomer(Integer id) {
        return customerRepo.findById(id);
    }

    public Customer saveCustomer(CustomerDto customerDto) {

        return customerRepo.save(mapper.INSTANCE.dtoToEntity(customerDto));
    }
}
