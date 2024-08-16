package com.phuoc.shop.controller;

import com.phuoc.shop.dto.request.UserCreationRequest;
import com.phuoc.shop.entity.User;
import com.phuoc.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping()
    User createUser(@RequestBody UserCreationRequest request) {
        return userService.createUser(request);
    }
    @GetMapping()
    List<User> getUsers(){
        return userService.getAlluser();
    }

}
