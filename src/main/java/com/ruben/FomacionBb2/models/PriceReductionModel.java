package com.ruben.FomacionBb2.models;

import com.ruben.FomacionBb2.enums.TypeReductionEnum;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.List;

@Data
@Entity(name="priceReduction")
@Table(name="priceReduction")
public class PriceReductionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPriceReduction;

    @Column(nullable = false)
    private Date startDate;

    @Column(nullable = false)
    private Date endDate;

    @Column(nullable = false)
    private Double ReducedPrice;

    @Column(nullable = false)
    private TypeReductionEnum reductionType;
     //TODO: relacion many to many
   // private List<ItemModel> itemReduced;



}
