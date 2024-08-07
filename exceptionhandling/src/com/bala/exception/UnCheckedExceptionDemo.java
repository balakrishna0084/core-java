package com.bala.exception;

public class UnCheckedExceptionDemo {

    public static void main(String[] args) {
        String input = null;
        input = "Smith";
        input.toUpperCase();
        input = input.substring(1,10);

    }
}
