package com.example.TrantorTraining.mapper;

import com.example.TrantorTraining.dto.CustomerDto;
import com.example.TrantorTraining.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface mapper {
    mapper INSTANCE  = Mappers.getMapper(mapper.class);

    Customer dtoToEntity(CustomerDto customerDto);

    CustomerDto entityToDto(Customer customer);
}
