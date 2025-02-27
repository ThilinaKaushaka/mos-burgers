package edu.icet.service.custom;

import edu.icet.model.dto.orders.OrderDto;
import edu.icet.model.dto.orders.PlaceOrderDto;
import edu.icet.repository.SuperDao;

import java.util.List;

public interface OrderService extends SuperDao {
    void addOrder(OrderDto orderDto);
    void updateOrder(OrderDto orderDto);
    void deleteOrder(String id);
    OrderDto viewOrderById(String id);
    List<OrderDto> getAll();
    void placeOrder(PlaceOrderDto placeOrderDto);
    PlaceOrderDto getOrderAndOrderDetailsById(String id);
    List<PlaceOrderDto> getPlaceOrders();
}
