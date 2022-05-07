package com.vallegrande.edu.msorder.repository;

import com.vallegrande.edu.msorder.model.Ordenes;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdenesRepository extends MongoRepository<Ordenes, String> {
}
