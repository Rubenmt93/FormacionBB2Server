package com.ruben.FomacionBb2.dto;

import com.ruben.FomacionBb2.models.ItemModel;
import java.util.List;

public class SupplierDTO {
        private Long idSupplier;
        private String name;
        private String country;
        private List<ItemDTO> itemsSupplied;

    public Long getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(Long idSupplier) {
        this.idSupplier = idSupplier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<ItemDTO> getItemsSupplied() {
        return itemsSupplied;
    }

    public void setItemsSupplied(List<ItemDTO> itemsSupplied) {
        this.itemsSupplied = itemsSupplied;
    }
}
