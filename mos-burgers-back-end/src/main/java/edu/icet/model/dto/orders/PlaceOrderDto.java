package edu.icet.model.dto.orders;

import edu.icet.model.dto.order_detail.OrderDetailsDto;
import lombok.*;
import util.PaymentType;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class PlaceOrderDto {
    private String id;
    private String customerId;
    private String customerName;
    private PaymentType paymentType;
    private Double total;
    private List<OrderDetailsDto> orderDetailsDtoList;
}
