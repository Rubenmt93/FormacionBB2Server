package com.ruben.FomacionBb2.assemblers;

import com.ruben.FomacionBb2.dto.DiscontinuedReportDTO;
import com.ruben.FomacionBb2.models.DiscontinuedReportModel;


import java.util.ArrayList;
import java.util.List;

public class DiscontinuedReportAssembler {

    UserAssembler userAssembler =  new UserAssembler() ;

    public DiscontinuedReportDTO model2DTO(DiscontinuedReportModel discontinuedReportModel) {
        if (discontinuedReportModel == null){return null;}
        DiscontinuedReportDTO discontinuedReportDTO =  new DiscontinuedReportDTO();
        discontinuedReportDTO.setIdDiscontinued(discontinuedReportModel.getIdDiscontinued());
        discontinuedReportDTO.setReason(discontinuedReportModel.getReason());
        discontinuedReportDTO.setUser(userAssembler.model2DTO(discontinuedReportModel.getUser()));


        return discontinuedReportDTO;
    }

    public List<DiscontinuedReportDTO> model2DTO(List<DiscontinuedReportModel> listDiscontinuedReportModel ){
        List<DiscontinuedReportDTO> discontinuedReportDTO= new ArrayList<>();
        for (DiscontinuedReportModel discontinuedReportModel: listDiscontinuedReportModel) {
            discontinuedReportDTO.add(model2DTO(discontinuedReportModel));
        }
        return discontinuedReportDTO;
    }
}
