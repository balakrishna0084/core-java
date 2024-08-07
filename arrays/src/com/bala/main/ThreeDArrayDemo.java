package com.bala.main;

import java.util.Arrays;

public class ThreeDArrayDemo {

    public static void main(String[] args) {

        int noOfStudents = 2;
        int subjects = 4;
        int totalSemesters = 5;

        int[][][] studentArray = new int[noOfStudents][subjects][totalSemesters];

        // Student 1 data
        int[][] student1 = {
                {88, 76, 90, 82, 98},
                {82, 96, 92, 78, 99},
                {86, 88, 94, 93, 100},
                {85, 86, 87, 89, 95}
        };

        // Student 2 data
        int[][] student2 = {
                {89, 76, 80, 82, 99},
                {82, 86, 92, 78, 79},
                {86, 98, 94, 93, 100},
                {85, 96, 87, 99, 95}
        };

        studentArray[0] = student1;
        studentArray[1] = student2;

        System.out.println(Arrays.deepToString(studentArray));
    }
}
