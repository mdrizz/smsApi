package com.smsservices.smsapp.service;
import com.smsservices.smsapp.config.TwilioConfig;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmsService {
    private final TwilioConfig twilioConfig;

    @Autowired
    public SmsService(TwilioConfig twilioConfig) {
        this.twilioConfig = twilioConfig;
        Twilio.init(twilioConfig.getAccountSid(), twilioConfig.getAuthToken());
    }

    public void sendSms(String toPhoneNumber, String message) {
        PhoneNumber to = new PhoneNumber(toPhoneNumber);
        PhoneNumber from = new PhoneNumber("+13203313375");
        Message twilioMessage = Message.creator(to, from , message).create();
        System.out.println("SMS sent: " + twilioMessage.getSid());
    }
}


