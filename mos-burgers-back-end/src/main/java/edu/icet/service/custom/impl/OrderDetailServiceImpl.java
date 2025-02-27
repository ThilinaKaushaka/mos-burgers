package edu.icet.service.custom.impl;

import edu.icet.model.dto.order_detail.OrderDetailsDto;
import edu.icet.model.entity.order_detail.OrderDetailsEntity;
import edu.icet.repository.custom.OrderDetailsRepository;
import edu.icet.service.custom.OrderDetailsService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderDetailServiceImpl implements OrderDetailsService {
    final ModelMapper mapper;
    final OrderDetailsRepository orderDetailsRepository;


    @Override
    public void addOrderDetail(OrderDetailsDto  orderDetailsDto) {
        orderDetailsRepository.save(mapper.map(orderDetailsDto, OrderDetailsEntity.class));
    }

    @Override
    public void updateOrderDetail(OrderDetailsDto orderDetailsDto) {
        addOrderDetail(orderDetailsDto);
    }

    @Override
    public void deleteOrderDetail(String orderId,String itemId) {
        orderDetailsRepository.deleteByOrderIdItemId(orderId,itemId);
    }

    @Override
    public OrderDetailsDto viewOrderIdByOrderIdItemId(String oderId,String itemId) {
        return mapper.map(orderDetailsRepository.findByOrderIdItemId(oderId,itemId), OrderDetailsDto.class);
    }

    @Override
    public List<OrderDetailsDto> getAll() {
        List<OrderDetailsDto> list=new ArrayList<>();
        for(OrderDetailsEntity orderDetailsEntity:orderDetailsRepository.findAll()){
            list.add(mapper.map(orderDetailsEntity, OrderDetailsDto.class));
        }
        return list;
    }

    @Override
    public List<OrderDetailsDto> viewAllOrderDetailsByOrderId(String orderId) {
        List<OrderDetailsDto> list=new ArrayList<>();
        for (OrderDetailsEntity orderDetailsEntity:orderDetailsRepository.findByOrderId(orderId)){
            list.add(mapper.map(orderDetailsEntity, OrderDetailsDto.class));
        }
        return list;
    }
}
