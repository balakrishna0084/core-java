package com.bala.main;

public class ArrayForLoopDemo {

    public static void main(String[] args) {
        int[] mobileNumbers = new int[116];
        mobileNumbers[0] = 996628778;
        mobileNumbers[9] = 958140046;
        mobileNumbers[18] = 996628678;
        mobileNumbers[45] = 958150046;
        mobileNumbers[54] = 996677778;

        for(int i=0; i<mobileNumbers.length; i++){
            System.out.println("The element at index: "+ i + " is: "+mobileNumbers[i]);
        }

        String[] names = new String[3];
        names[2] = "John";
        for(int i=0; i<names.length; i++){
            System.out.println("The element at index: "+ i + " is: "+names[i]);
        }
    }
}
