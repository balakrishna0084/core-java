package com.bala.generics;

import com.bala.generics.model.Developer;
import com.bala.generics.model.Employee;
import com.bala.generics.model.Manager;

import java.util.List;

public class UpperBoundWildCardDemo {

    public static void main(String[] args) {
        List<Employee> employees = List.of( new Employee(), new Employee());
        printEmployeeNames(employees);
        List<Developer> developers = List.of( new Developer(), new Developer());
         printEmployeeNames(developers);
        List<Manager> managers = List.of( new Manager(), new Manager());
        printEmployeeNames(managers);
    }

    public static void printEmployeeNames(List<? extends Employee> employees){
        for(Employee employee: employees){
            System.out.println(employee);
        }
    }
}
