package com.vallegrande.edu.msorder.service;

import com.vallegrande.edu.msorder.model.Ordenes;
import com.vallegrande.edu.msorder.repository.OrdenesRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class OrdenesServiceImpl implements OrdenesService{

    @Autowired
    OrdenesRepository ordenesRepository;

    @Override
    public List<Ordenes> findAll() {
        return ordenesRepository.findAll();
    }

    @Override
    public Ordenes create(Ordenes ordenes) {
        return ordenesRepository.save(ordenes);
    }

    @Override
    public Ordenes update(Ordenes ordenes) {
        Optional<Ordenes> optionalProduct = ordenesRepository.findById(ordenes.getId());
        if (!optionalProduct.isPresent()) throw new RuntimeException("No se encontro el producto a actualizar");
        return ordenesRepository.save(ordenes);
    }

    @Override
    public void delete(String id) {
        Optional<Ordenes> optionalProduct = ordenesRepository.findById(id);
        if (!optionalProduct.isPresent()) throw new RuntimeException("No se encontro el producto a eliminar");
        ordenesRepository.deleteById(id);
    }
}
