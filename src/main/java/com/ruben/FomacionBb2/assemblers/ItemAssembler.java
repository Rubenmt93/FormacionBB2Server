package com.ruben.FomacionBb2.assemblers;

import com.ruben.FomacionBb2.models.ItemModel;
import com.ruben.FomacionBb2.dto.ItemDTO;
import com.ruben.FomacionBb2.dto.UserDTO;

import java.util.ArrayList;
import java.util.List;

public class ItemAssembler {

    public ItemDTO Model2DTO(ItemModel itemModel){
        ItemDTO itemDTO;
        UserDTO userDTO;
        itemDTO = new ItemDTO();
        itemDTO.setIdItem( itemModel.getIdItem());
        itemDTO.setItemCode( itemModel.getItemCode());
        itemDTO.setDescriptionItem( itemModel.getDescriptionItem());
        itemDTO.setPrice( itemModel.getPrice());
        itemDTO.setCreationDate(itemModel.getCreationDate());
        itemDTO.setSuppliers(itemModel.getSuppliers());
        itemDTO.setState(itemModel.getState());
        userDTO = new UserDTO();
        userDTO.setIdUser(itemModel.getCreator().getIdUser());
        userDTO.setName(itemModel.getCreator().getName());
        userDTO.setSurname(itemModel.getCreator().getSurname());
        userDTO.setEmail(itemModel.getCreator().getEmail());
        userDTO.setRol(itemModel.getCreator().getRol());
        itemDTO.setCreator(userDTO);

        return itemDTO;
    }

    public List<ItemDTO> Model2DTO(List<ItemModel> listItemModel ){
        List<ItemDTO> listItemDto= new ArrayList<ItemDTO>();
        for (ItemModel itemModel: listItemModel) {
            listItemDto.add(Model2DTO(itemModel));
        }
        return listItemDto;
    }
}
