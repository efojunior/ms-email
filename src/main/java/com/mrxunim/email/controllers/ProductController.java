package com.mrxunim.email.controllers;


import com.mrxunim.email.models.ProductModel;
import com.mrxunim.email.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/product")
    public ResponseEntity<ProductModel> createdProduct(@RequestBody @Valid ProductModel productModel) {

        ProductModel result = productService.save(productModel);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }


}
