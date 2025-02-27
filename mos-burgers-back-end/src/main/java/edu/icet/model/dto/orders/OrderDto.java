package edu.icet.model.dto.orders;

import lombok.*;
import util.OrderStatus;
import util.PaymentType;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Builder
public class OrderDto {
    private String id;
    private String customerId;
    private String customerName;
    private PaymentType paymentType;
    private Double total;
    private OrderStatus orderStatus;
}
