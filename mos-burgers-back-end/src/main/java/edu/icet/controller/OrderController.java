package edu.icet.controller;

import edu.icet.model.dto.orders.OrderDto;
import edu.icet.model.dto.orders.PlaceOrderDto;
import edu.icet.service.custom.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
@CrossOrigin
public class OrderController {

    final OrderService orderService;

    @PostMapping("/add")
    void addOrder(@RequestBody OrderDto orderDto){
        orderService.addOrder(orderDto);
    }

    @PutMapping("/update")
    void updateOrder(@RequestBody OrderDto orderDto){
        orderService.updateOrder(orderDto);
    }

    @DeleteMapping("/delete/{id}")
    void deleteOrder(@PathVariable String id){
        orderService.deleteOrder(id);
    }

    @GetMapping("/search-by-id/{id}")
    OrderDto searchById(@PathVariable String id){
        return orderService.viewOrderById(id);
    }

    @GetMapping("/get-all")
    List<OrderDto> getAll(){
        return orderService.getAll();
    }


    @PostMapping("/add-order")
    void orderPlace(@RequestBody PlaceOrderDto placeOrderDto){
        orderService.placeOrder(placeOrderDto);
    }

    @GetMapping("/search-order-and-order-details/{orderId}")
    PlaceOrderDto searchOrderAndOrderDetailsByOrderId(@PathVariable String orderId){
        return orderService.getOrderAndOrderDetailsById(orderId);
    }

    @GetMapping("/get-all-place-orders")
    List<PlaceOrderDto> getAllPlaceOrders(){
        return orderService.getPlaceOrders();
    }


}
