package com.ruben.FomacionBb2.services;

import com.ruben.FomacionBb2.assemblers.UserAssembler;
import com.ruben.FomacionBb2.dto.ItemDTO;
import com.ruben.FomacionBb2.dto.UserDTO;
import com.ruben.FomacionBb2.models.ItemModel;
import com.ruben.FomacionBb2.models.UserModel;
import com.ruben.FomacionBb2.repositories.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    UserAssembler userAssembler= new UserAssembler();
    public List<UserDTO> findAll(){
        ArrayList<UserModel> listUserModel=(ArrayList<UserModel>) userRepository.findAll();
        List<UserDTO> listUserDTO = userAssembler.model2DTO(listUserModel);
        return listUserDTO;
    }
    public UserDTO makePersistent(UserModel user){
        return userAssembler.model2DTO(userRepository.save(user));
    }
    public Optional<UserDTO> findByIdUser(Long id){
        Optional<UserModel> userModel= userRepository.findById(id);
        UserDTO  a=  new  UserDTO();
        if(userModel.isPresent()){
            a=userAssembler.model2DTO(userModel.get());
            return Optional.of(a);        }
        return Optional.empty();
    }
    public Long deleteByidUser(Long id){
        return userRepository.removeByidUser(id);
    }
}


