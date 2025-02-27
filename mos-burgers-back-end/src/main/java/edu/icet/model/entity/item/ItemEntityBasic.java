package edu.icet.model.entity.item;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import util.ItemCategory;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ItemEntityBasic {
    private String id;
    private String name;
    private ItemCategory category;
    private String ingredients;
    private Double price;
    private Double discount;
    private Integer quantity;
    private Date exDate;
}
