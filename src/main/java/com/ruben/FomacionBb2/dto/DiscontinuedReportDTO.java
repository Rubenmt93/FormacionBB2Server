package com.ruben.FomacionBb2.dto;

import com.ruben.FomacionBb2.enums.ItemStateEnum;

import java.util.Date;
import java.util.List;

public class DiscontinuedReportDTO {

    private Long idDiscontinued;

    private ItemDTO itemDiscontinued;

    private UserDTO user;

    private String reason;

    public DiscontinuedReportDTO() { }

    public Long getIdDiscontinued() {
        return idDiscontinued;
    }

    public void setIdDiscontinued(Long idDiscontinued) {
        this.idDiscontinued = idDiscontinued;
    }

    public ItemDTO getItemDiscontinued() {
        return itemDiscontinued;
    }

    public void setItemDiscontinued(ItemDTO itemDiscontinued) {
        this.itemDiscontinued = itemDiscontinued;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
