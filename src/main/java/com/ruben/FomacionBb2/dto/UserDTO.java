package com.ruben.FomacionBb2.dto;


import com.ruben.FomacionBb2.enums.RolUserEnum;

import java.util.List;

public class UserDTO {

    private Long idUser;
    private String name;
    private String surname;
    private String email;
    private List<ItemDTO> items;
    private List<RolUserEnum> rol;


    public UserDTO(){}
    public UserDTO(Long idUser, String name, String surname, String email, List<RolUserEnum> rol) {
        this.idUser = idUser;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.rol = rol;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<ItemDTO> getItems() {
        return items;
    }

    public void setItems(List<ItemDTO> items) {
        this.items = items;
    }

    public List<RolUserEnum> getRol() {
        return rol;
    }

    public void setRol(List<RolUserEnum> rol) {
        this.rol = rol;
    }
}
