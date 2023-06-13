package com.ruben.FomacionBb2.controllers;

import com.ruben.FomacionBb2.models.SupplierModel;
import com.ruben.FomacionBb2.models.UserModel;
import com.ruben.FomacionBb2.services.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/supplier")
public class SupplierController {
    @Autowired
    SupplierService supplierService;

    @GetMapping()
    public ArrayList<SupplierModel> findAll(){
        return supplierService.findAll();
    }

    @PostMapping()
    public  SupplierModel save(@RequestBody SupplierModel supplier){
        return supplierService.makePersistent(supplier);
    }

}
