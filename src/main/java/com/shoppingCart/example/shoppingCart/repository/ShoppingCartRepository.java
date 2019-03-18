package com.shoppingCart.example.shoppingCart.repository;

import com.shoppingCart.example.shoppingCart.model.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart,Integer> {
}
