package com.bala.exception;

import java.util.logging.Logger;

public class ArrayIndexOutOfBoundExceptionDemo {

    private static Logger logger = Logger.getLogger(ArrayIndexOutOfBoundExceptionDemo.class.getName());

    public static void main(String[] args) {

        try{
            int[] numbers = {1,2,3,4,5};
            System.out.println(numbers[5]);
        }catch (ArrayIndexOutOfBoundsException ex){
            logger.severe("Invalid Array index. Please try again with a valid index number");
        }
    }
}
