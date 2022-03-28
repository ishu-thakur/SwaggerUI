package com.example.TrantorTraining.controller;

import com.example.TrantorTraining.dto.CustomerDto;
import com.example.TrantorTraining.entity.Customer;
import com.example.TrantorTraining.service.CustomerSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
public class CustomerController {

    @Autowired
    private CustomerSerivce customerSerivce;

    @GetMapping(value = "/findCustomer/{id}")
    public Optional<Customer> getCustomer(@PathVariable Integer id){
        return customerSerivce.getCustomer(id);
    }

    @PostMapping("/CustomerDetails")
    public Customer saveCustomer(@RequestBody CustomerDto customerDto)
    {
        System.out.println("Customer id " + customerDto.getCustomerId());
        System.out.println("Customer email " + customerDto.getEmail());
        System.out.println("Customer Mobile number " + customerDto.getMobileNumber());
        System.out.println("Customer Name " + customerDto.getName());
        Customer customer = customerSerivce.saveCustomer(customerDto);
        return customer;
    }
}
