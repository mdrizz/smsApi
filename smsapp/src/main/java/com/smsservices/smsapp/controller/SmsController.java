package com.smsservices.smsapp.controller;

import com.smsservices.smsapp.payload.SmsRequest;
import com.smsservices.smsapp.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmsController {
    private final SmsService smsService;

    @Autowired
    public SmsController(SmsService smsService) {
        this.smsService = smsService;
    }

    //http://localhost:8080/send-sms
    @PostMapping("/send-sms")
    public void sendSms(@RequestBody SmsRequest smsRequest) {
        String phoneNumber = smsRequest.getPhoneNumber();
        String message = smsRequest.getMessage();
        smsService.sendSms(phoneNumber, message);
    }
}


