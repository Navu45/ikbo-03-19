package yamon.Lab5;

import javax.swing.*;
import java.awt.*;

public class DrawingFigures extends JFrame {

    DrawingFigures(){
        setLayout(new GridLayout(4,5));
        JPanel[] panels = new JPanel[20];

        for (int i = 0; i < 20; i++) {
            panels[i] = new JPanel() {
                @Override
                public void paintComponent(Graphics g) {
                    int r = (int)(Math.random() * 255), gColor = (int)(Math.random() * 255);
                    int b = (int)(Math.random() * 255), x = (int)(Math.random() * 100);
                    int y = (int)(Math.random() * 100);
                    int width = (int)(Math.random() * (100 - x));
                    int height = (int)(Math.random() * (100 - y));

                    switch ((int)(Math.random() * 4))
                    {
                        case 1: {
                            int radius = (int)(Math.random() * 100);
                            width = (int)(Math.random() * (100 - radius));
                            height = (int)(Math.random() * (100 - radius));
                            Circle circle = new Circle(new Color(r, gColor, b), width, height, radius);
                            circle.draw(g);
                            break;
                        }

                        case 2: {

                            Rectangle rectangle = new Rectangle(new Color(r, gColor, b), x, y, width, height);
                            rectangle.draw(g);
                            break;
                        }

                        case 3: {
                            Oval oval = new Oval(new Color(r, gColor, b), x, y, width, height);
                            oval.draw(g);
                            break;
                        }
                        default:
                        {
                            Triangle triangle = new Triangle(new Color(r, gColor, b), x, y, width, height);
                            triangle.draw(g);
                            break;
                        }
                    }
                }
            };
            panels[i].setBorder(BorderFactory.createLineBorder(Color.black));
            add(panels[i]);
        }
        setTitle("My Shapes");
        setVisible(true);
        setSize(400, 500);
    }

    public static void main(String[] args) {
        new DrawingFigures();
    }
}

abstract class Shape {
    private Color color;
    private int x;
    private int y;
    private int width;
    private int height;

    public Shape(Color color, int x, int y, int width, int height) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public abstract void draw(Graphics g);
}

class Oval extends Shape {

    Oval(Color color, int x, int y, int width, int height) {
        super(color, x, y, width, height);
    }

    @Override
    public void draw(Graphics g) {
        g.fillOval(getX(), getY(), getWidth(),getHeight());
    }
}

class Circle extends Shape {

    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y, radius, radius);
    }

    @Override
    public void draw(Graphics g) {
        g.fillOval(getX(), getY(), getWidth(), getHeight());
    }
}

class Rectangle extends Shape{
    public Rectangle(Color color, int x, int y, int width, int height) {
        super(color, x, y, width, height);
    }

    @Override
    public void draw(Graphics g) {
        g.fillRect(getX(), getY(), getWidth(),getHeight());
    }
}

class Triangle extends Shape {

    public Triangle(Color color, int x, int y, int width, int height) {
        super(color, x, y, width, height);
    }

    @Override
    public void draw(Graphics g) {
        int[] xPoints = new int[3];
        int[] yPoints = new int[3];

        for (int i = 0; i < 3; i++) {
            xPoints[i] = (int)(Math.random() * 100);
            yPoints[i] = (int)(Math.random() * 100);
        }

        g.drawPolygon(xPoints, yPoints ,3);
    }
}
