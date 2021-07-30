package com.cjrnew.hrpayroll.service;

import com.cjrnew.hrpayroll.entity.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(Long workerId, Integer days) {
        return new Payment("Bob", 200d, days);
    }

}
