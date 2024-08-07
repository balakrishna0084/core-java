package com.bala.app;

import com.bala.model.Class1;
import com.bala.model.Employee;
import com.bala.model.Person;
import com.bala.model.Vehicle;

import static com.bala.utility.MyConstants.SHIPPING_COST;
import static com.bala.utility.MyConstants.TAX_RATE;
import static com.bala.utility.MyConstants.calculateTotalCost;
import static java.lang.Math.PI;

public class MainClass {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Employee employee = new Employee();

        System.out.println(TAX_RATE);
        System.out.println(SHIPPING_COST);

        System.out.println(calculateTotalCost(9.99));

        System.out.println(PI);

        Class1 model = new Class1();
        com.bala.service.Class1 service = new com.bala.service.Class1();

        MyOuterClass.MyInnerClass myInnerClass = new MyOuterClass.MyInnerClass();
        myInnerClass.display();

        AccessModifiersDemo accessModifiersDemo = new AccessModifiersDemo();

        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Doe");
        person.setAge(25);
        person.setSalary(10000.00);

        System.out.println(person.getLastName());
    }
}
