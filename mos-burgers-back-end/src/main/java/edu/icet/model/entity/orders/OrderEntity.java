package edu.icet.model.entity.orders;

import edu.icet.model.entity.customer.CustomerEntity;
import jakarta.persistence.*;
import lombok.*;
import util.PaymentType;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="orders")
public class OrderEntity {
    @Id
    private String id;

    private String customerId;
    private String customerName;

    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;

    private Double total;
}
