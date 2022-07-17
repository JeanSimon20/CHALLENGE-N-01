package com.jeansimon.msorder.controller;

import com.jeansimon.msorder.model.Order;
import com.jeansimon.msorder.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping
    public List<Order> findAll(){
        return orderService.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Order create(@RequestBody Order order){
        return orderService.create(order);
    }

    @PutMapping
    public Order update(@RequestBody Order order)   {
        return orderService.update(order);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        orderService.delete(id);
    }
}
