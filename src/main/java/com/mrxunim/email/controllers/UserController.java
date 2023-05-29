package com.mrxunim.email.controllers;


import com.mrxunim.email.models.ProductModel;
import com.mrxunim.email.models.UserModel;
import com.mrxunim.email.services.ProductService;
import com.mrxunim.email.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public ResponseEntity<UserModel> createdUser(@RequestBody @Valid UserModel userModel) {

        UserModel result = userService.save(userModel);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<UserModel> createdUser(@PathVariable UUID id) {

        UserModel result = userService.findById(id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }


}
