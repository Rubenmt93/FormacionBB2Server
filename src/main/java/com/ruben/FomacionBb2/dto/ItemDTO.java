package com.ruben.FomacionBb2.dto;

import com.ruben.FomacionBb2.enums.ItemStateEnum;
import com.ruben.FomacionBb2.models.SupplierModel;


import java.util.Date;
import java.util.List;

public class ItemDTO {

        private Long idItem;
        private Long itemCode;
        private String descriptionItem;

        private Double price;

        private UserDTO creator;

        private Date creationDate;


        private List<SupplierModel> suppliers;

        private ItemStateEnum state ;
    public ItemDTO() {
    }

    public Long getIdItem() {
        return idItem;
    }

    public void setIdItem(Long idItem) {
        this.idItem = idItem;
    }

    public Long getItemCode() {
        return itemCode;
    }

    public void setItemCode(Long itemCode) {
        this.itemCode = itemCode;
    }

    public String getDescriptionItem() {
        return descriptionItem;
    }

    public void setDescriptionItem(String descriptionItem) {
        this.descriptionItem = descriptionItem;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public UserDTO getCreator() {
        return creator;
    }

    public void setCreator(UserDTO creator) {
        this.creator = creator;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public List<SupplierModel> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(List<SupplierModel> suppliers) {
        this.suppliers = suppliers;
    }

    public ItemStateEnum getState() {
        return state;
    }

    public void setState(ItemStateEnum state) {
        this.state = state;
    }
}
