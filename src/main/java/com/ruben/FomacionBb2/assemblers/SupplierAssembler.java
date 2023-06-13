package com.ruben.FomacionBb2.assemblers;

import com.ruben.FomacionBb2.dto.SupplierDTO;

import com.ruben.FomacionBb2.models.SupplierModel;


import java.util.ArrayList;
import java.util.List;

public class SupplierAssembler {

    public List<SupplierDTO> model2DTO(List<SupplierModel> listSupplierModel){
        List<SupplierDTO> a = new ArrayList<SupplierDTO>();
        for (SupplierModel supplierModel: listSupplierModel) {
            a.add(model2DTO(supplierModel));
        }
        return a;
    }


    public SupplierDTO model2DTO(SupplierModel supplierModel){

        SupplierDTO supplierDTO = new SupplierDTO();
        supplierDTO.setIdSupplier(supplierModel.getIdSupplier());
        supplierDTO.setCountry(supplierModel.getCountry());
        supplierDTO.setName(supplierModel.getName());
        return supplierDTO;
    }


}
