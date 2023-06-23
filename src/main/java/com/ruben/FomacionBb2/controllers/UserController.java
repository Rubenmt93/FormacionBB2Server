package com.ruben.FomacionBb2.controllers;

import com.ruben.FomacionBb2.dto.ItemDTO;
import com.ruben.FomacionBb2.dto.UserDTO;
import com.ruben.FomacionBb2.models.UserModel;
import com.ruben.FomacionBb2.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuario")
@CrossOrigin()
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping()
    public List<UserDTO> findAll(){
        return userService.findAll();
    }
    @GetMapping("/{id}")
    public Optional<UserDTO> findById(@PathVariable("id") Long id){
        return this.userService.findByIdUser(id);
    }
    @PostMapping()
    public  UserDTO save(@RequestBody UserModel user){
        return userService.makePersistent(user);
    }
    @GetMapping("/eliminar/{id}")
    public Long deleteById(@PathVariable("id") Long id){
        return this.userService.deleteByidUser(id);
    }


}
