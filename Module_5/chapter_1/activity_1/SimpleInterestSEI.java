package com.example;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface SimpleInterestSEI {

    @WebMethod
    public double calculateSimpleInterest(double principal, double rate, double time);
}
