package edu.icet.model.dto.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerDto {
    private String id;
    private String tpNo;
    private String name;
    private Integer loyaltyPoints;
}
