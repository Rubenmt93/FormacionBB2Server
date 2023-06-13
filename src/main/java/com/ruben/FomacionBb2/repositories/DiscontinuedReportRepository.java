package com.ruben.FomacionBb2.repositories;

import com.ruben.FomacionBb2.models.DiscontinuedReportModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscontinuedReportRepository extends JpaRepository<DiscontinuedReportModel,Long> {
}
