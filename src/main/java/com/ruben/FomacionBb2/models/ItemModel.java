package com.ruben.FomacionBb2.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.ruben.FomacionBb2.enums.ItemStateEnum;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Entity(name="item")
@Table(name="item")

public class ItemModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idItem;

    @Column(name= "idCode", nullable = false, unique = true)
    private Long itemCode;


    private String descriptionItem;
    @Column(name="price",nullable = false)
    private Double price;

    @ManyToOne (targetEntity = UserModel.class, fetch = FetchType.LAZY)
    @JsonBackReference
    @JoinColumn(name="id_user", nullable=false)
    private UserModel creator;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date",updatable=false)
    private Date creationDate;

    @ManyToMany()
    @JoinTable(
            name = "item_Supplier",
            joinColumns = @JoinColumn(name = "id_item"),
            inverseJoinColumns = @JoinColumn(name = "id_supplier")
    )
    private List<SupplierModel> suppliers;
    private ItemStateEnum state = ItemStateEnum.Activo;

    @ManyToMany()
    @JoinTable(
            name = "item-priceReduction",
            joinColumns = @JoinColumn(name = "id_item"),
            inverseJoinColumns = @JoinColumn(name = "id_priceReduction")
    )
    private List<PriceReductionModel> priceReductions;
    @OneToOne(mappedBy = "itemDiscontinued",orphanRemoval = true)
    private DiscontinuedReportModel discontinuedReport;
}
