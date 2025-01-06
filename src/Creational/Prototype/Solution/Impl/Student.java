package Creational.Prototype.Solution.Impl;

import Creational.Prototype.Solution.Interface.Prototype;

public class Student implements Prototype {
    int age;
    private int rollNumber;
    String name;
    public Student(){};

    public Student(int age, int rollNumber, String name) {
        this.age = age;
        this.rollNumber = rollNumber;
        this.name = name;
    }
    @Override
    public Prototype cloned() {
        return new Student(age, rollNumber, name);
    }
}
