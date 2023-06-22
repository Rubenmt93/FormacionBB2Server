package com.ruben.FomacionBb2.repositories;

import com.ruben.FomacionBb2.models.DiscontinuedReportModel;
import com.ruben.FomacionBb2.models.ItemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiscontinuedReportRepository extends JpaRepository<DiscontinuedReportModel,Long> {
    public List<DiscontinuedReportModel> findAll();
}
