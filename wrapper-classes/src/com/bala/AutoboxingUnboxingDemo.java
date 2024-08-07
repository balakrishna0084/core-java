package com.bala;

public class AutoboxingUnboxingDemo {

    public static void main(String[] args) {
        // Autoboxing
        Integer integer = 16;
        Character character = 'M';
        Boolean boolObj = false;

        // Unboxing
        int num = integer;
        char m = character;
        boolean f = boolObj;

        System.out.println(num + "..."+ m + "..."+ f);

        Integer nullObj = null;
        int num1 = nullObj;
    }
}
