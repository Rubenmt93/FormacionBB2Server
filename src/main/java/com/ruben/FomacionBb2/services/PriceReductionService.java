package com.ruben.FomacionBb2.services;

import com.ruben.FomacionBb2.assemblers.ItemAssembler;
import com.ruben.FomacionBb2.assemblers.PriceReductionAssembler;
import com.ruben.FomacionBb2.dto.ItemDTO;
import com.ruben.FomacionBb2.dto.PriceReductionDTO;
import com.ruben.FomacionBb2.models.ItemModel;
import com.ruben.FomacionBb2.models.PriceReductionModel;
import com.ruben.FomacionBb2.repositories.ItemRepository;
import com.ruben.FomacionBb2.repositories.PriceReductionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PriceReductionService {
    PriceReductionAssembler priceReductionAssembler = new PriceReductionAssembler();
    @Autowired

    PriceReductionRepository priceReductionRepository;
    public List<PriceReductionDTO> findAll(){
        List<PriceReductionModel> list= (ArrayList<PriceReductionModel>) priceReductionRepository.findAll();

        List<PriceReductionDTO> listItemDTO = (List<PriceReductionDTO> ) priceReductionAssembler.model2DTO(list);
        return listItemDTO;
    }
    public PriceReductionModel makePersistent(PriceReductionModel priceReduction){
        return priceReductionRepository.save(priceReduction);
    }
}
