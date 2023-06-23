package com.ruben.FomacionBb2.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name="discontinuedReport")
@Table(name="discontinuedReport")

public class DiscontinuedReportModel {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idDiscontinued;

        @Column(nullable = false)
        private String reason;

        @ManyToOne (targetEntity = UserModel.class, fetch = FetchType.LAZY)
        @JsonBackReference
        @JoinColumn(name="id_user", nullable=false)
        private UserModel user;

        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "id_item", referencedColumnName = "idItem")
        private ItemModel itemDiscontinued;
}
