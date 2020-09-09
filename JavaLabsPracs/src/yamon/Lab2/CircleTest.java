package yamon.Lab2;

public class CircleTest {
    public static void main(String[] args)
    {
        Circle circle = new Circle(10);
        System.out.println(circle.toString());
        circle.setRadius(15);
        System.out.println(circle.toString());
        System.out.println(circle.getRadius());
        System.out.println(circle.getCircumference());
        System.out.println(circle.getSquare());
    }


}

class Circle {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    double getSquare() {
        return Math.PI * Math.pow(radius, 2);
    }

    double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
