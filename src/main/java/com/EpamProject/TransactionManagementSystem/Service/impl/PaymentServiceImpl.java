package com.EpamProject.TransactionManagementSystem.Service.impl;

import com.EpamProject.TransactionManagementSystem.Entities.Payment;
import com.EpamProject.TransactionManagementSystem.Repository.PaymentRepository;
import com.EpamProject.TransactionManagementSystem.Service.PaymentService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    private PaymentRepository paymentRepository;

    public PaymentServiceImpl(PaymentRepository paymentRepository){
        super();
        this.paymentRepository=paymentRepository;
    }
    @Override
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    @Override
    public Payment savePayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentRepository.findById(id).get();
    }

    @Override
    public Payment updatePayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public void deletePaymentById(Long id) {

       paymentRepository.deleteById(id);

    }
}
