package com.jeansimon.msorder.service;

import com.jeansimon.msorder.model.Order;
import com.jeansimon.msorder.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order create(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order update(Order order) {
        Optional<Order> optionalProducto = orderRepository.findById(order.getId());
        if(!optionalProducto.isPresent()) throw new RuntimeException("No se actualizo el producto");
        return orderRepository.save(order);
    }

    @Override
    public void delete(String id) {
        Optional<Order> optionalProducto = orderRepository.findById(id);
        if(!optionalProducto.isPresent()) throw new RuntimeException("No se elimino el producto");
        orderRepository.deleteById(id);
    }
}
