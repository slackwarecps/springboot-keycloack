package com.fabioalvaro.appb.keycloackappb;

import com.fabioalvaro.appb.keycloackappb.feign.Payment;
import com.fabioalvaro.appb.keycloackappb.feign.PaymentClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaymentController {

    private final PaymentClient paymentClient;

    public PaymentController(PaymentClient paymentClient) {
        this.paymentClient = paymentClient;
    }

    @GetMapping("/payments")
    public List<Payment> getPayments() {
        List<Payment> payments = paymentClient.getPayments();
        return payments;
    }
}