package com.shoppingCart.example.shoppingCart.resource;

import com.shoppingCart.example.shoppingCart.repository.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest/shoppingCart")
public class ShoppingCartResource {

    @Autowired
    ShoppingCartRepository shoppingCartRepository;




}
