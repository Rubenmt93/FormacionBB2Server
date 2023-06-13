package com.ruben.FomacionBb2.controllers;

import com.ruben.FomacionBb2.dto.ItemDTO;
import com.ruben.FomacionBb2.models.ItemModel;
import com.ruben.FomacionBb2.models.PriceReductionModel;
import com.ruben.FomacionBb2.services.PriceReductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/priceReduction")
public class PriceReductionController {
    @Autowired
    PriceReductionService priceReductionService;

    @GetMapping()
    public List<PriceReductionModel> findAll(){
        return  priceReductionService.findAll();
    }
    @PostMapping()
    public PriceReductionModel save(@RequestBody PriceReductionModel priceReduction){
        try {
            return priceReductionService.makePersistent(priceReduction);
        }catch ( HttpMessageNotReadableException error){
            return null;
        }

    }

}
