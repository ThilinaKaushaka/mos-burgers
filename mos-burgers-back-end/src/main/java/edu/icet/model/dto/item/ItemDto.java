package edu.icet.model.dto.item;

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
public class ItemDto {
    private String id;
    private String name;
    private ItemCategory category;
    private String ingredients;
    private Double price;
    private Double discount;
    private Integer quantity;
    private Date exDate;
    private String   imageURL;
}
