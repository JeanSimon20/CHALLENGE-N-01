package com.vallegrande.edu.msorder.controller;

import com.vallegrande.edu.msorder.model.Ordenes;
import com.vallegrande.edu.msorder.service.OrdenesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ms-order/v1/order")
public class OrdenesController {

    @Autowired
    OrdenesService ordenesService;

    @GetMapping
    public List<Ordenes> findAll(){
        return ordenesService.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Ordenes create(@RequestBody Ordenes ordenes){
        return ordenesService.create(ordenes);
    }

    @PutMapping
    public Ordenes update(@RequestBody Ordenes ordenes) {
        return ordenesService.update(ordenes);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        ordenesService.delete(id);
    }
}
