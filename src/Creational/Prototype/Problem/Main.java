package Creational.Prototype.Problem;

//Problem is cloning logic present in client.
public class Main {
    public static void main(String[] args) {
        Student std = new Student(13,2, "Aman");

        Student clonedStd = new Student();
        clonedStd.age = std.age;
        clonedStd.name = std.name;
        //clonedStd.rollNumber = std.rollNumber;
    }
}
