package com.EpamProject.TransactionManagementSystem.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "card_type")
    private String type;

    @Column(name = "card_name")
    private String cardName;

    @Column(name = "card_number")
    private String cardNumber;

    @Column(name = "expiry_year")
    private int expiryYear;

    @Column(name = "expiry_month")
    private int expiryMonth;

    @Column(name = "cvc")
    private int cvc;



}
