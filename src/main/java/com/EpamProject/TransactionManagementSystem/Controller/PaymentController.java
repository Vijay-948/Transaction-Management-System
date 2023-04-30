package com.EpamProject.TransactionManagementSystem.Controller;

import com.EpamProject.TransactionManagementSystem.Entities.Payment;
import com.EpamProject.TransactionManagementSystem.Service.PaymentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class PaymentController {

    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService){
        super();
        this.paymentService=paymentService;
    }

    @GetMapping("/payments")
    public String listPayment(Model model){
        model.addAttribute("payments", paymentService.getAllPayments());
        return "payments";
    }

    @GetMapping("payments/new")
    public String createPaymentsForm(Model model){

        Payment payment = new Payment();
        model.addAttribute("payment", payment);
        return "create_payment";
    }

    @PostMapping("/payments")
    public String savePayment(@ModelAttribute("payment") Payment payment) {
        paymentService.savePayment(payment);
        return "redirect:/payments";
    }

    @GetMapping("/payments/edit/{id}")
    public String editPaymentForm(@PathVariable Long id, Model model){
        model.addAttribute("payment", paymentService.getPaymentById(id));
        return "edit_payment";
    }

    @PostMapping("/payments/{id}")
    public String updatePayment(@PathVariable Long id, @ModelAttribute("payment") Payment payment, Model model){
        Payment existingPayment = paymentService.getPaymentById(id);
        existingPayment.setId(id);
        existingPayment.setFirstName(payment.getFirstName());
        existingPayment.setLastName(payment.getLastName());
        existingPayment.setType(payment.getType());
        existingPayment.setCardName(payment.getCardName());
        existingPayment.setCardNumber(payment.getCardNumber());
        existingPayment.setExpiryYear(payment.getExpiryYear());
        existingPayment.setExpiryMonth(payment.getExpiryMonth());
        existingPayment.setCvc(payment.getCvc());


        paymentService.updatePayment(existingPayment);
        return "redirect:/payments";

    }

    @GetMapping("/payments/{id}")
    public String deletePayment(@PathVariable Long id){
        paymentService.deletePaymentById(id);
        return "redirect:/payments";
    }



}
