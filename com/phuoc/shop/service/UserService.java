package com.phuoc.shop.service;


import com.phuoc.shop.dto.request.UserCreationRequest;
import com.phuoc.shop.entity.User;
import com.phuoc.shop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public User createUser(UserCreationRequest request){
    User user = new User();
    user.setName(request.getName());
    user.setPassword(request.getPassword());
    user.setEmail(request.getEmail());
    user.setImage(request.getImage());
    user.setRole(request.getRole());
    user.setDate(request.getDate());
    user.setAddress(request.getAddress());
    user.setInformation(request.getInformation());
    user.setID_from(request.getID_from());
    user.setNamereal(request.getNamereal());
    user.setStatus(0);
    return userRepository.save(user);
    }


    public List<User> getAlluser(){
    return userRepository.findAll();
    }

}
