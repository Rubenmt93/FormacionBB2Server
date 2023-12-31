package com.ruben.FomacionBb2.assemblers;


import com.ruben.FomacionBb2.models.ItemModel;
import com.ruben.FomacionBb2.dto.ItemDTO;
import java.util.ArrayList;
import java.util.List;

public class ItemAssembler {
    UserAssembler userAssembler = new UserAssembler();
    SupplierAssembler supplierAssembler = new SupplierAssembler();
    PriceReductionAssembler priceReductionAssembler = new PriceReductionAssembler();

     DiscontinuedReportAssembler discontinuedReportAssembler= new DiscontinuedReportAssembler();
    public ItemDTO itemModel2DTO(ItemModel itemModel){
        ItemDTO itemDTO= new ItemDTO();
        itemDTO.setIdItem( itemModel.getIdItem());
        itemDTO.setItemCode( itemModel.getItemCode());
        itemDTO.setDescriptionItem( itemModel.getDescriptionItem());
        itemDTO.setPrice( itemModel.getPrice());
        itemDTO.setCreationDate(itemModel.getCreationDate());
        itemDTO.setSuppliers(supplierAssembler.model2DTO(itemModel.getSuppliers()));
        itemDTO.setState(itemModel.getState());
        itemDTO.setCreator(userAssembler.model2DTO(itemModel.getCreator()));
        itemDTO.setPriceReductions(priceReductionAssembler.model2DTO(itemModel.getPriceReductions()));
        itemDTO.setDiscontinuedReport(discontinuedReportAssembler.model2DTO(itemModel.getDiscontinuedReport()));
        return itemDTO;
    }

    public List<ItemDTO> itemModel2DTO(List<ItemModel> listItemModel ){
        List<ItemDTO> listItemDto= new ArrayList<ItemDTO>();
        for (ItemModel itemModel: listItemModel) {
            listItemDto.add(itemModel2DTO(itemModel));
        }
        return listItemDto;
    }

}
