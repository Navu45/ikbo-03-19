package yamon.Lab3;

public class DishTest{
    public static void main(String[] args)
    {
        Pan pan = new Pan(22, 10);
        System.out.println(pan.getHeight());
        System.out.println(pan.getDiameter());
        pan.breaking();
        System.out.println(pan.isBroken());
    }
}

abstract class Dish {
    private int diameter;

    public Dish(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public abstract void breaking();
    public abstract boolean isBroken();
}


class Pan extends Dish {
    private int height;
    private boolean isBent = false;

    public Pan(int diameter, int height) {
        super(diameter);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void breaking() {
        isBent = true;
    }

    @Override
    public boolean isBroken() {
        return isBent;
    }
}


