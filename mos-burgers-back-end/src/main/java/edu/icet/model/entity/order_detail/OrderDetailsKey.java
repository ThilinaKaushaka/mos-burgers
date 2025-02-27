package edu.icet.model.entity.order_detail;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDetailsKey implements Serializable {
    private String orderId;
    private String itemId;
}
