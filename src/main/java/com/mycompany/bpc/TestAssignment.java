package com.mycompany.bpc;

import java.util.Date;


public class TestAssignment{
    public static void main(String[] args) {
        //create an object
        Assignment a1 = new Assignment();
        a1.setTitle("PHP with Oracle ");
        a1.setDueDate(new Date("03/09/2024"));
        
        //instantiate a teacher
        Teacher t = new Teacher(101, "Ravi Shah", "ravi@gmail.com");
        t.publishAssignment(a1);
        Teacher t2 = new Teacher(102, "Ramita Sinha", "ramita@gmail.com");
        t2.publishAssignment(a1);
        
        System.out.println("The total teachers in memory is "+Teacher.getCount());
    }
}