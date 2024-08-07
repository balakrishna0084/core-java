package com.bala.exception;

public class ExecptionPropagationDemo {

    public static void main(String[] args) {
        method1();
        System.out.println("Main method");
    }

    static void method1(){
        try{
            method2();
        }catch (NullPointerException ex){
            System.out.println(ex.getMessage());
        }

    }

    static void method2(){
        method3();
    }

    static void method3(){
        throw new NullPointerException("An nullpointer exception occurred");
    }
}
