package com.example;

import javax.xml.ws.Endpoint;

public class SimpleInterestPublisher {

    public static void main(String[] args) {

        Endpoint.publish(
            "http://localhost:8080/SimpleInterest",
            new SimpleInterestImpl()
        );

        System.out.println("Simple Interest Web Service is published!");
        System.out.println("WSDL available at:");
        System.out.println("http://localhost:8080/SimpleInterest?wsdl");
    }
}