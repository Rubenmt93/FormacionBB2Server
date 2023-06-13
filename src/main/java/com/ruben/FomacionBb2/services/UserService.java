package com.ruben.FomacionBb2.services;

import com.ruben.FomacionBb2.models.UserModel;
import com.ruben.FomacionBb2.repositories.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public ArrayList<UserModel> findAll(){
        return (ArrayList<UserModel>) userRepository.findAll();
    }
    public UserModel makePersistent(UserModel user){
        return userRepository.save(user);
    }

//    public ArrayList<UserModel>  findPersonal(){
//        return userRepository.findPersonal();
//    }

}


