package com.java.Useofsuperwithconstructors;

/* subclass Student extending the Person class */
class Student extends Person
{
    Student()
    {
        // invoke or call parent class constructor
        super();
  
        System.out.println("subclass Student class Constructor");
    }
}