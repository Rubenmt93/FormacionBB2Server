package com.ruben.FomacionBb2.services;

import com.ruben.FomacionBb2.dto.ItemDTO;
import com.ruben.FomacionBb2.models.ItemModel;
import com.ruben.FomacionBb2.repositories.ItemRepository;
import com.ruben.FomacionBb2.assemblers.ItemAssembler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;
    ItemAssembler itemAssembler = new ItemAssembler();
    public List<ItemDTO> findAll(){
        ArrayList<ItemModel> items = (ArrayList<ItemModel>) itemRepository.findAll();
        List<ItemDTO> listItemDTO = itemAssembler.itemModel2DTO(items);
        return listItemDTO;
    }
    public ItemModel makePersistent(ItemModel item){
        return itemRepository.save(item);
    }

    public List<ItemModel> findAllOrderByState(@org.jetbrains.annotations.NotNull String order) {

        if( order.equals("ASC")){
            return itemRepository.findAllByOrderByStateAsc();
        } else {
            return itemRepository.findAllByOrderByStateDesc();

        }
    }


}
