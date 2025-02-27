package edu.icet.model.entity.order_detail;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="orderDetails")
@IdClass(OrderDetailsKey.class)
public class OrderDetailsEntity{

    @Id
    private String orderId;
    @Id
    private String itemId;

    private Integer qty;
    private Double discount;
    private Double unitPrice;
    private Double total;
}
