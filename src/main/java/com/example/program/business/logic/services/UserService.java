package com.example.program.business.logic.services;

import com.example.program.business.logic.models.User;
import com.example.program.dataaccess.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public ArrayList<User> getUsers(){
        return (ArrayList<User>) userRepository.findAll();
    }


}
