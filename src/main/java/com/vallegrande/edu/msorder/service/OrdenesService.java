package com.vallegrande.edu.msorder.service;

import com.vallegrande.edu.msorder.model.Ordenes;

import java.util.List;

public interface OrdenesService {

    List<Ordenes> findAll();

    Ordenes create(Ordenes ordenes);

    Ordenes update(Ordenes ordenes);

    void delete(String id);
}
