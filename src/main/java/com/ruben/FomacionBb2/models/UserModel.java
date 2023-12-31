package com.ruben.FomacionBb2.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.ruben.FomacionBb2.enums.RolUserEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity(name="usuario")
@Table(name="usuario")

public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String password;

    @Column(unique = true,nullable = false)
    private String email;

    @JsonManagedReference

    @OneToMany( targetEntity = ItemModel.class,
                mappedBy="creator",
                cascade = CascadeType.ALL,
                fetch = FetchType.LAZY)

    private List<ItemModel> items;

    private List<RolUserEnum> rol;
    @OneToMany( targetEntity = DiscontinuedReportModel.class,
                mappedBy="user",
                cascade = CascadeType.ALL,
                fetch = FetchType.LAZY)
    private List<DiscontinuedReportModel> listDiscontinued;

}
