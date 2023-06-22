package com.ruben.FomacionBb2.dto;


import com.ruben.FomacionBb2.enums.RolUserEnum;

import java.util.List;

public class UserDTO {

    private Long idUser;
    private String name;
    private String email;
    private List<ItemDTO> items;
    private List<RolUserEnum> rol;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

    public UserDTO(){}
    public UserDTO(Long idUser, String name, String email,String password, List<RolUserEnum> rol) {
        this.idUser = idUser;
        this.name = name;
        this.email = email;
        this.rol = rol;
        this.password = password;
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
