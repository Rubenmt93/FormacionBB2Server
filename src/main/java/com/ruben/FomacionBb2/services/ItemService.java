package com.ruben.FomacionBb2.services;

import com.ruben.FomacionBb2.dto.ItemDTO;
import com.ruben.FomacionBb2.enums.ItemStateEnum;
import com.ruben.FomacionBb2.models.ItemModel;
import com.ruben.FomacionBb2.repositories.ItemRepository;
import com.ruben.FomacionBb2.assemblers.ItemAssembler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


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



    public Optional<ItemDTO> findByIdItem(Long id){
        Optional<ItemModel> itemModel= itemRepository.findById(id);
        ItemDTO  a=  new  ItemDTO();
        if(itemModel.isPresent()){
            a=itemAssembler.itemModel2DTO(itemModel.get());
            return Optional.of(a);        }
            return Optional.empty();
    }
    public List<ItemDTO> findByState(String state){

        ItemStateEnum a = ItemStateEnum.valueOf(state);
        ArrayList<ItemModel> items = (ArrayList<ItemModel>) itemRepository.findByState(a);
        List<ItemDTO> listItemDTO = itemAssembler.itemModel2DTO(items);
        return listItemDTO;
    }
    public Long deleteByidItem(Long id){
        return itemRepository.removeByidItem(id);
    }
}
