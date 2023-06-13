package com.ruben.FomacionBb2.services;

import com.ruben.FomacionBb2.dto.ItemDTO;
import com.ruben.FomacionBb2.models.ItemModel;
import com.ruben.FomacionBb2.models.PriceReductionModel;
import com.ruben.FomacionBb2.repositories.ItemRepository;
import com.ruben.FomacionBb2.repositories.PriceReductionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceReductionService {
    @Autowired
    PriceReductionRepository priceReductionRepository;
    public List<PriceReductionModel> findAll(){
        return  priceReductionRepository.findAll();
    }
    public PriceReductionModel makePersistent(PriceReductionModel priceReduction){
        return priceReductionRepository.save(priceReduction);
    }
}
