package com.lidl.shopping.service.controllers;

import com.lidl.shopping.models.Order;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public Order getOrder(/*@PathVariable int id*/) {
        return new Order();
    }
}
