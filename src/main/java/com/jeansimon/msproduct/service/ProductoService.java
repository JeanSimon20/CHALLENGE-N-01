package com.jeansimon.msproduct.service;

import com.jeansimon.msproduct.model.Producto;

import java.util.List;

public interface ProductoService {

    List<Producto> findAll();

    Producto create(Producto product);

    Producto update(Producto product);

    void delete(String id);

}
