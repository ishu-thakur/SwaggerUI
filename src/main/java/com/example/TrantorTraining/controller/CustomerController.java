package com.example.TrantorTraining.controller;

import com.example.TrantorTraining.entity.Customer;
import com.example.TrantorTraining.repo.CustomerRepo;
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
    public Customer saveCustomer(@RequestBody Customer customer)
    {
        System.out.println("Customer id " + customer.getCustomerId());
        System.out.println("Customer email " + customer.getEmail());
        System.out.println("Customer Mobile number " + customer.getMobileNumber());
        System.out.println("Customer Name " + customer.getName());
        Customer save = customerSerivce.saveCustomer(customer);
        return save;
    }
}
