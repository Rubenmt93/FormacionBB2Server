package com.ruben.FomacionBb2.services;

import com.ruben.FomacionBb2.models.DiscontinuedReportModel;
import com.ruben.FomacionBb2.repositories.DiscontinuedReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DiscontinuedReportService {
    @Autowired
    DiscontinuedReportRepository discontinuedReportRepository;
    public ArrayList<DiscontinuedReportModel> findAll(){
        return (ArrayList<DiscontinuedReportModel>) discontinuedReportRepository.findAll();
    }
    public DiscontinuedReportModel makePersistent(DiscontinuedReportModel report){
        return discontinuedReportRepository.save(report);
    }

}
