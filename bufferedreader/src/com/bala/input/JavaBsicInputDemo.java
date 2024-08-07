package com.bala.input;

import java.io.IOException;

public class JavaBsicInputDemo {

    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a value...");
        int num = System.in.read();
        System.out.println("The user entered a value:"+num);
    }
}
