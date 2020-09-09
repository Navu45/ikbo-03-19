package yamon.Prac1;

public class Pr1 {
    public static void main(String[] args)
    {
        Dog dog = new Dog("Jake");
        dog.setAge(4);
        dog.setBreed("rottweiler");
        dog.setColor("black");
        System.out.println(dog.toString());

        Ball ball = new Ball(10, 700, "white");
        System.out.println(ball.getColor() + " " + ball.getPrice() + " " + ball.getRadius());
        System.out.println(ball.toString());

        Book book = new Book();
        book.setAuthor("me");
        book.setFormat("A4");
        book.setNumOfPages(40);
        System.out.println(book.toString());
    }

}

class Dog{
    private String name;
    private int age;
    private String breed;
    private String color;

    public Dog(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

class Ball{
    private int radius;
    private int price;
    private String color;

    public String getColor() {
        return color;
    }

    public Ball(int radius, int price, String color) {
        this.radius = radius;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "radius=" + radius +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

class Book{
    private String name;
    private String author;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", numOfPages=" + numOfPages +
                ", price=" + price +
                ", format='" + format + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    private int numOfPages;
    private int price;
    private String format;

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}