package edu.icet.controller;

import edu.icet.model.dto.item.ItemDto;
import edu.icet.service.custom.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
@RequiredArgsConstructor
@CrossOrigin
public class ItemController {

    final ItemService itemService;

    @PostMapping("/add")
    void addItem(@RequestBody ItemDto itemDto){
        itemService.addItem(itemDto);

    }

    @PutMapping("/update")
    void updateItem(@RequestBody ItemDto itemDto){
        itemService.updateItem(itemDto);
    }

    @DeleteMapping("/delete/{id}")
    void deleteItem(@PathVariable String id){
        itemService.deleteItem(id);
    }

    @GetMapping("/search-by-id/{id}")
    ItemDto searchById(@PathVariable String id){
        return itemService.viewItemById(id);
    }

    @GetMapping("/get-all")
    List<ItemDto> getAll(){
        return itemService.getAll();
    }

    @GetMapping("/search-by-category")
    List<ItemDto> searchByCategory(@RequestParam(name="category")String category){
        return itemService.viewByCategory(category);
    }


}
