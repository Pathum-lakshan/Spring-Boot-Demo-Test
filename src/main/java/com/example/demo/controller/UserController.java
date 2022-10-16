package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {
    @GetMapping("/getUser")
    public String getUser(){
        return "test get mapping data";
    }
    @PostMapping("/saveUser")
    public String saveUser(@RequestBody UserDTO userDTO){
        return "test post mapping";
    }
    @PutMapping("/updateUser")
    public String updateUser(){
        return "test put mapping";
    }
    @DeleteMapping("/deleteUser")
    public String deleteUser(){
        return "test delete mapping";
    }
}
