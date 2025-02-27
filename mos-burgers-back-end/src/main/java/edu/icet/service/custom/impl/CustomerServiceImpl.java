package edu.icet.service.custom.impl;

import edu.icet.model.dto.customer.CustomerDto;
import edu.icet.model.entity.customer.CustomerEntity;
import edu.icet.repository.custom.CustomerRepository;
import edu.icet.service.custom.CustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    final CustomerRepository customerRepository;
    final ModelMapper mapper;

    @Override
    public void addCustomer(CustomerDto customerDto) {
        customerRepository.save(mapper.map(customerDto, CustomerEntity.class));
    }

    @Override
    public void updateCustomer(CustomerDto customerDto) {
        addCustomer(customerDto);
    }

    @Override
    public void deleteCustomer(String customerId) {
        customerRepository.deleteById(customerId);
    }

    @Override
    public CustomerDto getCustomer(String customerId) {
        return mapper.map(customerRepository.findById(customerId), CustomerDto.class);
    }

    @Override
    public List<CustomerDto> getAllCustomers() {
        List<CustomerDto> list=new ArrayList<>();
        for(CustomerEntity customerentity:customerRepository.findAll()){list.add(mapper.map(customerentity, CustomerDto.class));}
        return list;
    }
}
