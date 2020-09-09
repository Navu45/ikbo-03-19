package yamon.Lab3;

public class DogTest {
    public static void main(String[] main){
        Basenji basenji = new Basenji("Jake", 5);
        basenji.bark();

        GermanShepherd germanShepherd = new GermanShepherd("Charlie", 2);
        germanShepherd.bark();

    }
}

abstract class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void bark();
}

class Basenji extends Dog{

    public Basenji(String name, int age) {
        super(name, age);
    }

    @Override
    public void bark() {
        System.out.println("*silence!*");
    }
}

class GermanShepherd extends Dog{

    public GermanShepherd(String name, int age) {
        super(name, age);
    }

    @Override
    public void bark() {
        System.out.println("*WOOF-WOOF-WOOF!*");
    }
}
