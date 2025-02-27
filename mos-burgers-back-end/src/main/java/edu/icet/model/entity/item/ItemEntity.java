package edu.icet.model.entity.item;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import util.ItemCategory;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="item")
public class ItemEntity {
    @Id
    private String id;
    private String name;

    @Enumerated(EnumType.STRING)
    private ItemCategory category;

    private String ingredients;
    private Double price;
    private Double discount;
    private Integer quantity;
    private Date exDate;
    private String imageURL;


}
