package com.bala.marvel.base;

public abstract class Subject {

    public int marks;
    public static final int MIN_MARKS = 0;

    // concrete methods
    public int totalMarks(){
        return 100;
    }

    public abstract void teach();
}
