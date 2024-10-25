package com.smsservices.smsapp.payload;

public class SmsRequest {
    private String PhoneNumber;
    private String message;

    // Add getters and setters

    public String getPhoneNumber() {

        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {

        this.PhoneNumber = PhoneNumber;
    }

    public String getMessage() {

        return message;
    }

    public void setMessage(String message) {

        this.message = message;
    }
}

