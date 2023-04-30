package com.EpamProject.TransactionManagementSystem.Service;

import com.EpamProject.TransactionManagementSystem.Entities.Payment;

import java.util.HashSet;
import java.util.List;

public interface PaymentService {

    List<Payment> getAllPayments();

    Payment savePayment(Payment payment);

    Payment getPaymentById(Long id);

    Payment updatePayment(Payment payment);

    void deletePaymentById(Long id);
}
