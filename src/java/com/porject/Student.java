// Creating the student character blueprint

package com.porject;

import java.util.Iterator;

class Student {
    private String name;
    private int rollNo;
    private String address;
  public Student()
  {
      
  }
    // This is how we create a new student with their details
    public Student(String name, int rollNo, String address) {
        this.name = name;
        this.rollNo = rollNo;
        this.address = address;
    }

    // These methods are like asking the student for their details
    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return " Name:" + name + ",Roll No:" + rollNo + ", Address: " + address;
    }

  
}