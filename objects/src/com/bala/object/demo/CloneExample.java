package com.bala.object.demo;

public class CloneExample {

    public static void main(String[] args) throws CloneNotSupportedException {
        Course course = new Course();
        course.setCourseName("Math");

        Student originalStudent = new Student("Alice", course);
        Student clonedStudent = (Student)originalStudent.clone();
        System.out.println(originalStudent == clonedStudent);
        System.out.println(originalStudent.getCourse() == clonedStudent.getCourse());
    }
}
