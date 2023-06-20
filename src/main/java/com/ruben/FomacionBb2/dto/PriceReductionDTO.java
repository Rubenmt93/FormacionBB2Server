package com.ruben.FomacionBb2.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.ruben.FomacionBb2.enums.TypeReductionEnum;
import com.ruben.FomacionBb2.models.ItemModel;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToMany;

import java.util.Date;
import java.util.List;

public class PriceReductionDTO {
    private Long idPriceReduction;
    private Date startDate;
    private Date endDate;
    private Double reducedPrice;
    private TypeReductionEnum reductionType;
    private List<Long> itemsReduced;

    public Long getIdPriceReduction() {
        return idPriceReduction;
    }

    public void setIdPriceReduction(Long idPriceReduction) {
        this.idPriceReduction = idPriceReduction;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Double getReducedPrice() {
        return reducedPrice;
    }

    public void setReducedPrice(Double reducedPrice) {
        this.reducedPrice = reducedPrice;
    }

    public TypeReductionEnum getReductionType() {
        return reductionType;
    }

    public void setReductionType(TypeReductionEnum reductionType) {
        this.reductionType = reductionType;
    }

    public List<Long> getItemsReduced() {
        return itemsReduced;
    }

    public void setItemsReduced(List<Long> itemsReduced) {
        this.itemsReduced = itemsReduced;
    }
}
