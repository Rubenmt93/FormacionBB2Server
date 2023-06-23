package com.ruben.FomacionBb2.assemblers;

import com.ruben.FomacionBb2.dto.ItemDTO;
import com.ruben.FomacionBb2.dto.UserDTO;
import com.ruben.FomacionBb2.models.ItemModel;
import com.ruben.FomacionBb2.models.UserModel;

import java.util.ArrayList;
import java.util.List;

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
    public List<UserDTO> model2DTO(List<UserModel> listUserModel ){
        List<UserDTO> listUserDto= new ArrayList<UserDTO>();
        for (UserModel userModel: listUserModel) {
            listUserDto.add(model2DTO(userModel));
        }
        return listUserDto;
    }
}
