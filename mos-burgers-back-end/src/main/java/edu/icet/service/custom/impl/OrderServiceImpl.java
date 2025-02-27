package edu.icet.service.custom.impl;

import edu.icet.model.dto.order_detail.OrderDetailsDto;
import edu.icet.model.dto.orders.OrderDto;
import edu.icet.model.dto.orders.PlaceOrderDto;
import edu.icet.model.entity.order_detail.OrderDetailsEntity;
import edu.icet.model.entity.orders.OrderEntity;
import edu.icet.repository.custom.ItemRepository;
import edu.icet.repository.custom.OrderDetailsRepository;
import edu.icet.repository.custom.OrderRepository;
import edu.icet.service.custom.OrderService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    final ModelMapper mapper;
    final OrderRepository orderRepository;
    final OrderDetailsRepository orderDetailsRepository;
    final ItemRepository itemRepository;


    @Override
    public void addOrder(OrderDto orderDto) {
        orderRepository.save(mapper.map(orderDto, OrderEntity.class));
    }

    @Override
    public void updateOrder(OrderDto orderDto) {
        addOrder(orderDto);
    }

    @Override
    public void deleteOrder(String id) {
        orderRepository.deleteById(id);
    }

    @Override
    public OrderDto viewOrderById(String id) {
        return mapper.map(orderRepository.findById(id), OrderDto.class);
    }

    @Override
    public List<OrderDto> getAll() {
        List<OrderDto>list=new ArrayList<>();
        for(OrderEntity orderEntity:orderRepository.findAll()){
            list.add(mapper.map(orderEntity, OrderDto.class));
        }
        return list;
    }

    @Override
    public void placeOrder(PlaceOrderDto placeOrderDto) {
        addOrder(OrderDto.builder().id(placeOrderDto.getId()).customerId(placeOrderDto.getCustomerId()).customerName(placeOrderDto.getCustomerName()).paymentType(placeOrderDto.getPaymentType()).total(placeOrderDto.getTotal()).build());
        for (OrderDetailsDto orderDetailsDto:placeOrderDto.getOrderDetailsDtoList()){
            orderDetailsRepository.save(mapper.map(orderDetailsDto, OrderDetailsEntity.class));
            itemRepository.updateTable(orderDetailsDto.getItemId(),orderDetailsDto.getQty());
        }
    }

    @Override
    public PlaceOrderDto getOrderAndOrderDetailsById(String id) {
        OrderDto orderDto = viewOrderById(id);
        return PlaceOrderDto.builder().id(orderDto.getId()).customerId(orderDto.getCustomerId()).customerName(orderDto.getCustomerName()).total(orderDto.getTotal()).orderDetailsDtoList(getList(id)).build();
    }

    @Override
    public List<PlaceOrderDto> getPlaceOrders() {
        List<PlaceOrderDto> placeOrderList=new ArrayList<>();
        for(OrderDto orderDto:getAll()){
            placeOrderList.add(PlaceOrderDto.builder().id(orderDto.getId()).customerId(orderDto.getCustomerId()).customerName(orderDto.getCustomerName()).paymentType(orderDto.getPaymentType()).total(orderDto.getTotal()).orderDetailsDtoList(getList(orderDto.getId())).build());
        }
        return placeOrderList;
    }

    private List<OrderDetailsDto>getList(String id){
        List<OrderDetailsDto> list=new ArrayList<>();
        for(OrderDetailsEntity orderDetailsEntity:orderDetailsRepository.findByOrderId(id)){
            list.add(mapper.map(orderDetailsEntity, OrderDetailsDto.class));
        }
        return list;
    }

}
