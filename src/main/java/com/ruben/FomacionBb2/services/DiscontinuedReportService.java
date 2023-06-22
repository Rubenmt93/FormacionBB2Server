package com.ruben.FomacionBb2.services;

import com.ruben.FomacionBb2.assemblers.DiscontinuedReportAssembler;
import com.ruben.FomacionBb2.dto.DiscontinuedReportDTO;
import com.ruben.FomacionBb2.models.DiscontinuedReportModel;
import com.ruben.FomacionBb2.repositories.DiscontinuedReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DiscontinuedReportService {
    @Autowired
    DiscontinuedReportRepository discontinuedReportRepository ;

    DiscontinuedReportAssembler discontinuedReportAssembler = new DiscontinuedReportAssembler();
    public List<DiscontinuedReportDTO> findAll(){
        ArrayList<DiscontinuedReportModel> reports =  (ArrayList<DiscontinuedReportModel>) discontinuedReportRepository.findAll();

        return  discontinuedReportAssembler.model2DTO(reports);

    }
    public DiscontinuedReportModel makePersistent(DiscontinuedReportModel report){
        return discontinuedReportRepository.save(report);
    }

}
