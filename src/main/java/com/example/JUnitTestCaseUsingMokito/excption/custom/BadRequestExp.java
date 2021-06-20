package com.example.JUnitTestCaseUsingMokito.excption.custom;

public class BadRequestExp extends RuntimeException {

    public BadRequestExp(String msg) {
        super(msg);
    }
}
