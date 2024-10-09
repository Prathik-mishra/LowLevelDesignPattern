package PrototypeDesignPattern;
interface Prototype{
    Prototype clone();
}

class Student1 implements Prototype{
    String name;
    int age;
    private int rollNumber;

    Student1(){

    }

    public Student1(String name, int age, int rollNumber){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    public Prototype clone(){
        return new Student1(this.name,this.age,this.rollNumber);
    }
}
public class Prototype2 {
    public static void main(String[] args) {

        //this example here resolves all the problem faced in prototype1 :

        Student1 original = new Student1();
        Student1 clone = (Student1) original.clone();
    }
}
