package com.ruben.FomacionBb2.assemblers;

import com.ruben.FomacionBb2.dto.PriceReductionDTO;
import com.ruben.FomacionBb2.dto.SupplierDTO;
import com.ruben.FomacionBb2.models.ItemModel;
import com.ruben.FomacionBb2.dto.ItemDTO;
import com.ruben.FomacionBb2.dto.UserDTO;
import com.ruben.FomacionBb2.models.PriceReductionModel;
import com.ruben.FomacionBb2.models.SupplierModel;
import com.ruben.FomacionBb2.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ItemAssembler {

    public ItemDTO itemModel2DTO(ItemModel itemModel){
        ItemDTO itemDTO= new ItemDTO();
        itemDTO.setIdItem( itemModel.getIdItem());
        itemDTO.setItemCode( itemModel.getItemCode());
        itemDTO.setDescriptionItem( itemModel.getDescriptionItem());
        itemDTO.setPrice( itemModel.getPrice());
        itemDTO.setCreationDate(itemModel.getCreationDate());
        itemDTO.setSuppliers(supplierModel2DTO(itemModel.getSuppliers()));
        itemDTO.setState(itemModel.getState());
        itemDTO.setCreator(userModel2DTO(itemModel.getCreator()));

        itemDTO.setPriceReductions(priceReductionModel2DTO(itemModel.getPriceReductions()));
        return itemDTO;
    }

    public List<ItemDTO> itemModel2DTO(List<ItemModel> listItemModel ){
        List<ItemDTO> listItemDto= new ArrayList<ItemDTO>();
        for (ItemModel itemModel: listItemModel) {
            listItemDto.add(itemModel2DTO(itemModel));
        }
        return listItemDto;
    }

    public List<SupplierDTO> supplierModel2DTO(List<SupplierModel> listSupplierModel){
        List<SupplierDTO> a = new ArrayList<SupplierDTO>();
        for (SupplierModel supplierModel: listSupplierModel) {
            a.add(supplierModel2DTO(supplierModel));
        }
        return a;
    }


    public SupplierDTO supplierModel2DTO(SupplierModel supplierModel){

        SupplierDTO supplierDTO = new SupplierDTO();
        supplierDTO.setIdSupplier(supplierModel.getIdSupplier());
        supplierDTO.setCountry(supplierModel.getCountry());
        supplierDTO.setName(supplierModel.getName());
        return supplierDTO;
    }

    public UserDTO userModel2DTO(UserModel userModel){
        UserDTO userDTO = new UserDTO();

        userDTO.setIdUser(userModel.getIdUser());
        userDTO.setName(userModel.getName());
        userDTO.setSurname(userModel.getSurname());
        userDTO.setEmail(userModel.getEmail());
        userDTO.setRol(userModel.getRol());
        return userDTO;
    }

    public PriceReductionDTO priceReductionModel2DTO(PriceReductionModel priceReductionModel){
        PriceReductionDTO priceReductionDTO = new PriceReductionDTO();

        priceReductionDTO.setIdPriceReduction(priceReductionModel.getIdPriceReduction());
        priceReductionDTO.setReducedPrice(priceReductionModel.getReducedPrice());
        priceReductionDTO.setStartDate(priceReductionModel.getStartDate());
        priceReductionDTO.setEndDate(priceReductionModel.getEndDate());
        priceReductionDTO.setReductionType(priceReductionModel.getReductionType());

        return priceReductionDTO;
    }
    public List<PriceReductionDTO> priceReductionModel2DTO(List<PriceReductionModel> priceReductionModel){
        List<PriceReductionDTO> a = new ArrayList<PriceReductionDTO>();
        for (PriceReductionModel b: priceReductionModel) {
            a.add(priceReductionModel2DTO(b));
        }
        return a;
    }
}
