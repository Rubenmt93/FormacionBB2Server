package com.ruben.FomacionBb2.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

import java.util.List;

@Data
@Entity(name="supplier")
@Table(name="supplier")
public class SupplierModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSupplier;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String country;
    @ManyToMany (mappedBy = "suppliers")

    @JsonBackReference
    private List<ItemModel> itemsSupplied;
}
