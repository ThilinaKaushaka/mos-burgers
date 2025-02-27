package edu.icet.service.custom;

import edu.icet.model.dto.order_detail.OrderDetailsDto;
import edu.icet.service.SuperService;

import java.util.List;

public interface OrderDetailsService extends SuperService {
    void addOrderDetail(OrderDetailsDto orderDetailsDto);
    void updateOrderDetail(OrderDetailsDto orderDetailsDto);
    void deleteOrderDetail(String orderId,String itemId);
    OrderDetailsDto viewOrderIdByOrderIdItemId(String orderId,String itemId);
    List<OrderDetailsDto> getAll();

    List<OrderDetailsDto> viewAllOrderDetailsByOrderId(String orderId);
}
