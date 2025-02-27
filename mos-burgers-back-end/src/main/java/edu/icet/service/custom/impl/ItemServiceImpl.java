package edu.icet.service.custom.impl;

import edu.icet.model.dto.item.ItemDto;
import edu.icet.model.entity.item.ItemEntity;
import edu.icet.repository.custom.ItemRepository;
import edu.icet.service.custom.ItemService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    final ItemRepository itemRepository;
    final ModelMapper mapper;


    @Override
    public void addItem(ItemDto itemDto) {
        itemRepository.save(mapper.map(itemDto, ItemEntity.class));
    }

    @Override
    public void updateItem(ItemDto itemDto) {
        itemRepository.save(mapper.map(itemDto, ItemEntity.class));
    }

    @Override
    public void deleteItem(String id) {
        itemRepository.deleteById(id);

    }

    @Override
    public ItemDto viewItemById(String id) {
        return mapper.map(itemRepository.findById(id), ItemDto.class);
    }

    @Override
    public List<ItemDto> getAll() {
        List<ItemDto> list = new ArrayList<>();
        for(ItemEntity itemEntity:itemRepository.findAll()){
            list.add(mapper.map(itemEntity, ItemDto.class));
        }
        return list;
    }

    @Override
    public List<ItemDto> viewByCategory(String category) {
        List<ItemDto> list=new ArrayList<>();
        for (ItemEntity itemEntity:itemRepository.findByCategory(category)){
            list.add(mapper.map(itemEntity, ItemDto.class));
        }
        return list;
    }


}
