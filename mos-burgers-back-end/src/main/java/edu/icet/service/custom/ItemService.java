package edu.icet.service.custom;

import edu.icet.model.dto.item.ItemDto;
import edu.icet.service.SuperService;

import java.util.List;

public interface ItemService extends SuperService {
    void addItem(ItemDto itemDto);
    void updateItem(ItemDto itemDto);
    void deleteItem(String id);
    ItemDto viewItemById(String id);
    List<ItemDto> getAll();

    List<ItemDto> viewByCategory(String category);
}
