package yamon.Lab4;

import static java.lang.System.*;

public class NameableTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Carl");
        Bird bird = new Bird("Lec");

        out.println(dog.getName());
        out.println(bird.getName());
    }
}

interface Nameable {
    String getName();
}

class Dog implements Nameable{
    private String name;

    Dog(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

class Bird implements Nameable {

    private String name;

    Bird(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
