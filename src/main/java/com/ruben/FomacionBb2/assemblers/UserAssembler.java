package com.ruben.FomacionBb2.assemblers;

import com.ruben.FomacionBb2.dto.UserDTO;
import com.ruben.FomacionBb2.models.UserModel;

public class UserAssembler {
    public UserDTO model2DTO(UserModel userModel){
        UserDTO userDTO = new UserDTO();

        userDTO.setIdUser(userModel.getIdUser());
        userDTO.setName(userModel.getName());
        userDTO.setEmail(userModel.getEmail());
        userDTO.setRol(userModel.getRol());
        userDTO.setPassword(userModel.getPassword());
        return userDTO;
    }
}
