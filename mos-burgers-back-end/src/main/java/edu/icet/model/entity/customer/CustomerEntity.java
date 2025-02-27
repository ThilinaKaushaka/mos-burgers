package edu.icet.model.entity.customer;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="customer")
public class CustomerEntity {
    @Id
    private String id;

    @Column(unique = true)
    private String tpNo;

    private String name;
    private Integer loyaltyPoints;
}
