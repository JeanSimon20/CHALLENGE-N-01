package com.jeansimon.mspayment.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "payment")
public class Payment {
    private String id;
    private String titular;
    private String tarjeta;
    private String fecha;
    private String cvv;

}
