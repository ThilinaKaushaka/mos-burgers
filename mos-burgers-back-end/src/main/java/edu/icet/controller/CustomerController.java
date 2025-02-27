package edu.icet.controller;

import edu.icet.model.dto.customer.CustomerDto;
import edu.icet.service.custom.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
@CrossOrigin
public class CustomerController {

    final CustomerService customerService;

    @PostMapping("/add")
    void addCustomer(@RequestBody CustomerDto customerDto) {
        customerService.addCustomer(customerDto);
    }

    @PutMapping("/update")
    void updateCustomer(@RequestBody CustomerDto customerDto){
        customerService.updateCustomer(customerDto);
    }

    @DeleteMapping("/delete/{id}")
    void deleteCustomer(@PathVariable String id){
        customerService.deleteCustomer(id);
    }

    @GetMapping("/search-by-id/{id}")
    CustomerDto getCustomer(@PathVariable String id){
        return customerService.getCustomer(id);
    }

    @GetMapping("/get-all")
    List<CustomerDto> getAllCustomers(){
        return customerService.getAllCustomers();
    }

}
