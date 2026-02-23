package com.example;

import javax.jws.WebService;

@WebService(endpointInterface = "com.example.SimpleInterestSEI")
public class SimpleInterestImpl implements SimpleInterestSEI {

    @Override
    public double calculateSimpleInterest(double principal, double rate, double time) {

        return (principal * rate * time) / 100;
    }
}