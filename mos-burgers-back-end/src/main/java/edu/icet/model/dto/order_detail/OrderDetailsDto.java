package edu.icet.model.dto.order_detail;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrderDetailsDto{
    private String orderId;
    private String itemId;
    private Integer qty;
    private Double discount;
    private Double unitPrice;
    private Double total;
}
