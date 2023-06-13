package com.ruben.FomacionBb2.assemblers;

import com.ruben.FomacionBb2.dto.PriceReductionDTO;
import com.ruben.FomacionBb2.models.PriceReductionModel;

import java.util.ArrayList;
import java.util.List;

public class PriceReductionAssembler {


    public PriceReductionDTO model2DTO(PriceReductionModel priceReductionModel){
        PriceReductionDTO priceReductionDTO = new PriceReductionDTO();

        priceReductionDTO.setIdPriceReduction(priceReductionModel.getIdPriceReduction());
        priceReductionDTO.setReducedPrice(priceReductionModel.getReducedPrice());
        priceReductionDTO.setStartDate(priceReductionModel.getStartDate());
        priceReductionDTO.setEndDate(priceReductionModel.getEndDate());
        priceReductionDTO.setReductionType(priceReductionModel.getReductionType());

        return priceReductionDTO;
    }
    public List<PriceReductionDTO> model2DTO(List<PriceReductionModel> priceReductionModel){
        List<PriceReductionDTO> a = new ArrayList<PriceReductionDTO>();
        for (PriceReductionModel b: priceReductionModel) {
            a.add(model2DTO(b));
        }
        return a;
    }
}
