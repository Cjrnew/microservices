package com.cjrnew.hrpayroll.service;

import com.cjrnew.hrpayroll.entity.Payment;
import com.cjrnew.hrpayroll.entity.Worker;
import com.cjrnew.hrpayroll.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(Long workerId, Integer days) {

        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);

    }

}
