package yamon.Prac3.Task45;

public class MoveableCircle implements Moveable{

    private int radius;
    MoveablePoint center;

    public MoveableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MoveablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public String toString() {
        return "MoveableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}
