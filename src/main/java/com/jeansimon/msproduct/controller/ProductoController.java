package com.jeansimon.msproduct.controller;


import com.jeansimon.msproduct.model.Producto;
import com.jeansimon.msproduct.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import java.util.List;

@RestController
@RequestMapping("producto")
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @GetMapping
    public List<Producto> findAll(){
        return productoService.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Producto create(@RequestBody Producto producto){
        return productoService.create(producto);
    }

    @PutMapping
    public Producto update(@RequestBody Producto producto) {
        return productoService.update(producto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        productoService.delete(id);
    }

}
