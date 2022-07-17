package com.jeansimon.msproduct.service;

import com.jeansimon.msproduct.model.Producto;
import com.jeansimon.msproduct.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    ProductoRepository productoRepository;

    @Override
    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    @Override
    public Producto create(Producto producto){
        return productoRepository.save(producto);
    }

    @Override
    public Producto update(Producto producto){
        Optional<Producto> optionalProducto = productoRepository.findById(producto.getId());
        if(!optionalProducto.isPresent()) throw new RuntimeException("No se actualizo el producto");
        return productoRepository.save(producto);
    }

    @Override
    public void delete(String id){
        Optional<Producto> optionalProducto = productoRepository.findById(id);
        if(!optionalProducto.isPresent()) throw new RuntimeException("No se elimino el producto");
        productoRepository.deleteById(id);
    }

}
