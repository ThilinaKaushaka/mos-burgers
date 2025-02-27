package edu.icet.repository.custom;

import edu.icet.model.entity.orders.OrderEntity;
import edu.icet.repository.SuperDao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends SuperDao, JpaRepository<OrderEntity,String> {
}
