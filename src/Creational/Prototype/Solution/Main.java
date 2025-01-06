package Creational.Prototype.Solution;

import Creational.Prototype.Solution.Impl.Student;

public class Main {
    public static void main(String[] args) {
        Student std = new Student(13, 2, "Aman");

        Student clonedStd = (Student) std.cloned();
    }
}
