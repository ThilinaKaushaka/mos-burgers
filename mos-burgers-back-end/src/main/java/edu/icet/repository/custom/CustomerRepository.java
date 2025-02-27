package edu.icet.repository.custom;

import edu.icet.model.entity.customer.CustomerEntity;
import edu.icet.repository.SuperDao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends SuperDao , JpaRepository<CustomerEntity,String> {
}
