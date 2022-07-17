package com.jeansimon.msorder.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "order")
public class Order {
    @Id
    private String Id;
    private String cliente;
    private String producto;
    private String fecha;
}
