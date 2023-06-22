package com.ruben.FomacionBb2.controllers;

import com.ruben.FomacionBb2.dto.DiscontinuedReportDTO;
import com.ruben.FomacionBb2.models.DiscontinuedReportModel;
import com.ruben.FomacionBb2.models.UserModel;
import com.ruben.FomacionBb2.services.DiscontinuedReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/discontinuedReport")
@CrossOrigin()
public class DiscontinuedReportController {
    @Autowired
    DiscontinuedReportService discontinuedReportService;
    @GetMapping()
    public List<DiscontinuedReportDTO> findAll(){
        return    discontinuedReportService.findAll();
    }


    @PostMapping()
    public  DiscontinuedReportModel save(@RequestBody DiscontinuedReportModel report){
        return discontinuedReportService.makePersistent(report);
    }
}
