package com.mousebrushstudio;

public class Person {
    private String name;
    private String rollNo;

    public Person(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String toString() {
        return "Name: " + this.name +" Roll no: " + this.rollNo;
    }
}
