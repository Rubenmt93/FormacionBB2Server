package com.ruben.FomacionBb2.controllers;

import com.ruben.FomacionBb2.models.ItemModel;
import com.ruben.FomacionBb2.dto.ItemDTO;
import com.ruben.FomacionBb2.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
@CrossOrigin()
public class ItemController {

    @Autowired
    ItemService itemService;

    @GetMapping()
    public List<ItemDTO> findAll(){

        return  itemService.findAll();

    }

    @PostMapping()
    public  ItemModel save(@RequestBody ItemModel item){
        try {
            return itemService.makePersistent(item);
        }catch ( HttpMessageNotReadableException error){
            return null;
        }

    }
    @GetMapping("/{order}")
    public List<ItemModel> findAllOrderByState(@PathVariable("order") String order){
        return this.itemService.findAllOrderByState(order);
    }



}
