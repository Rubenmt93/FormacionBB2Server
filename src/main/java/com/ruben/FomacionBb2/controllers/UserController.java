package com.ruben.FomacionBb2.controllers;

import com.ruben.FomacionBb2.models.UserModel;
import com.ruben.FomacionBb2.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/usuario")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping()
    public ArrayList<UserModel> findAll(){
        return userService.findAll();
    }

    @PostMapping()
    public  UserModel save(@RequestBody UserModel user){
        return userService.makePersistent(user);
    }

//    @GetMapping("/personal")
//    public ArrayList<UserModel> findPersonal(){
//        ArrayList<UserModel> arrayList = userService.findPersonal();
//        return arrayList;
//    }

}
