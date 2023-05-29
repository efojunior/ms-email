package com.mrxunim.email.services;


import com.mrxunim.email.models.ProductModel;
import com.mrxunim.email.models.UserModel;
import com.mrxunim.email.repositories.ProductRepository;
import com.mrxunim.email.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserModel save (UserModel userModel){

        return userRepository.save(userModel);
    }
    public UserModel findById (UUID id){

        return userRepository.getById(id);
    }


}
