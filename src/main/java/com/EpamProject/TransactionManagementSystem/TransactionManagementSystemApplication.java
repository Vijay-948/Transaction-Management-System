package com.EpamProject.TransactionManagementSystem;

import com.EpamProject.TransactionManagementSystem.Repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication


public class TransactionManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionManagementSystemApplication.class, args);
	}

	@Autowired
	private PaymentRepository paymentRepository;



}
