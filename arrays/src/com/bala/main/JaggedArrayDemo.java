package com.bala.main;

import java.util.Arrays;

public class JaggedArrayDemo {

    public static void main(String[] args) {
        int[][] jaggedArray = new int[4][];

        int[] array1 = {5,7,3,2,1};
        int[] array2 = {};
        int[] array3 = {65,74};
        int[] array4 = {89,2,9,2};

        jaggedArray[0] = array1;
        jaggedArray[1] = array2;
        jaggedArray[2] = array3;
        jaggedArray[3] = array4;

        System.out.println(Arrays.deepToString(jaggedArray));
    }
}
