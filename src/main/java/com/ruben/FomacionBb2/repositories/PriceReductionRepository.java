package com.ruben.FomacionBb2.repositories;

import com.ruben.FomacionBb2.models.PriceReductionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceReductionRepository  extends JpaRepository<PriceReductionModel, Long> {
}
