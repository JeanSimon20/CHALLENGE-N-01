package com.jeansimon.msproduct.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.math.BigDecimal;

@Data
@Document(collection = "producto")
public class Producto {
    @Id
    private String id;
    private String name;
    private Integer stock;
    private BigDecimal price;
}
