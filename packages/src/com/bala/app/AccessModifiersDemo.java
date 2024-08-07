package com.bala.app;

public class AccessModifiersDemo {

    private int privateVariable;
    protected int protectedVariable;
    public int publicVariable;
    int defaultVariable;

    public void publicMethod(){
        System.out.println("Hello from public method");
    }

    protected void protectedMethod(){
        System.out.println("Hello from protected method");
    }

    private void privateMethod(){
        System.out.println("Hello from private method");
    }

    void defaultMethod(){
        System.out.println("Hello from default method");
    }
}
