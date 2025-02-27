package edu.icet.service.custom;

import edu.icet.model.dto.customer.CustomerDto;
import edu.icet.service.SuperService;

import java.util.List;

public interface CustomerService extends SuperService {
    void addCustomer(CustomerDto customerDto);
    void updateCustomer(CustomerDto customerDto);
    void deleteCustomer(String customerId);
    CustomerDto getCustomer(String customerId);
    List<CustomerDto> getAllCustomers();
}
