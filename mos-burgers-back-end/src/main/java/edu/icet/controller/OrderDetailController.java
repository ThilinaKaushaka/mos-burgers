package edu.icet.controller;

import edu.icet.model.dto.order_detail.OrderDetailsDto;
import edu.icet.service.custom.OrderDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order-details")
@RequiredArgsConstructor
@CrossOrigin
public class OrderDetailController {

    final OrderDetailsService orderDetailsService;

    @PostMapping("/single-add")
    void addOrderDetail(@RequestBody OrderDetailsDto orderDetailsDto){
        orderDetailsService.addOrderDetail(orderDetailsDto);
    }

    @PutMapping("/update")
    void updateOrderDetail(@RequestBody OrderDetailsDto orderDetailsDto){
        orderDetailsService.updateOrderDetail(orderDetailsDto);
    }

    @DeleteMapping("/delete")
    void deleteByOrderIdItemId(@RequestParam(name = "order_id")String orderId,@RequestParam(name = "item_id")String itemId){
        orderDetailsService.deleteOrderDetail(orderId,itemId);
    }

    @GetMapping("/search-by-orderId-itemId")
    OrderDetailsDto searchByOrderIdItemId(@RequestParam(name="order_id") String orderId, @RequestParam(name="item_id")String itemId){
        return orderDetailsService.viewOrderIdByOrderIdItemId(orderId,itemId);
    }

    @GetMapping("/search-by-orderId/{orderId}")
    List<OrderDetailsDto> searchByOrderId(@PathVariable String orderId){
        return orderDetailsService.viewAllOrderDetailsByOrderId(orderId);
    }
}
