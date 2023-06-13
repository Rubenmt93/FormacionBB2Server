package com.ruben.FomacionBb2.services;

import com.ruben.FomacionBb2.models.SupplierModel;
import com.ruben.FomacionBb2.models.UserModel;
import com.ruben.FomacionBb2.repositories.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class SupplierService {
@Autowired
    SupplierRepository supplierRepository;

    public ArrayList<SupplierModel> findAll(){
        return (ArrayList<SupplierModel>) supplierRepository.findAll();
    }
    public SupplierModel makePersistent(SupplierModel supplier){
        return supplierRepository.save(supplier);
    }

}
