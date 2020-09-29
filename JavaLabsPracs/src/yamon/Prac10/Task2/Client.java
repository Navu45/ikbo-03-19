package yamon.Prac10.Task2;

public class Client {
    Chair chair;

    public void sit() {
        System.out.println("Sit on " + Chair.class.getName());
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
