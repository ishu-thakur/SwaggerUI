package com.example.TrantorTraining.service;

import com.example.TrantorTraining.entity.Customer;
import com.example.TrantorTraining.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerSerivce implements CustomerServiceInterface{


    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public Optional<Customer> getCustomer(Integer id) {
        return customerRepo.findById(id);
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepo.save(customer);
    }
}
