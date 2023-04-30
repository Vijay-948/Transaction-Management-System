package com.EpamProject.TransactionManagementSystem.Repository;

import com.EpamProject.TransactionManagementSystem.Entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
