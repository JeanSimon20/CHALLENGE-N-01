package com.jeansimon.mspayment.service;

import com.jeansimon.mspayment.model.Payment;
import com.jeansimon.mspayment.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentServiceImpl implements PaymentService{

    @Autowired
    PaymentRepository paymentRepository;
    @Override
    public List<Payment> findAll() {
        return paymentRepository.findAll();
    }

    @Override
    public Payment create(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public Payment update(Payment payment) {
        Optional<Payment> optionalProducto = paymentRepository.findById(payment.getId());
        if(!optionalProducto.isPresent()) throw new RuntimeException("No se actualizo el producto");
        return paymentRepository.save(payment);
    }

    @Override
    public void delete(String id) {
        Optional<Payment> optionalProducto = paymentRepository.findById(id);
        if(!optionalProducto.isPresent()) throw new RuntimeException("No se elimino el producto");
        paymentRepository.deleteById(id);
    }
}
