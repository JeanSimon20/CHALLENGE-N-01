package com.jeansimon.msorder.service;

import com.jeansimon.msorder.model.Order;
import java.util.List;

public interface OrderService {
    List<Order> findAll();

    Order create(Order order);

    Order update(Order order);

    void delete(String id);

}
