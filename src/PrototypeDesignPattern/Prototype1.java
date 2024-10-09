package PrototypeDesignPattern;
class Student{
    String name;
    int age;
    private int rollNumber;

    Student(){

    }

    public Student(String name, int age, int rollNumber){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }
}

public class Prototype1 {
    public static void main(String[] args) {
        Student original = new Student("prathik",22,235);

        Student clone = new Student();
        clone.age = original.age;
        clone.name = original.name;
//        clone.rollNumber = original.rollNumber;   // --> this here is a problem when we try to access a private member outside the class
        // --> and client also needs to know the inner properties of the class to use it which is not good...
    }
}
