package com.example.client;

public class SimpleInterestClient {

    public static void main(String[] args) {

        SimpleInterestImplService service = new SimpleInterestImplService();
        SimpleInterestSEI sei = service.getSimpleInterestImplPort();

        double result = sei.calculateSimpleInterest(20000, 10, 2);

        System.out.println("Simple Interest is: " + result);
    }
}