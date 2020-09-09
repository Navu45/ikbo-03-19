package yamon.Lab2;

public class Human {
    private String name;
    private String surname;
    private int age;
    private int height;
    private double weight;
    private Head head;
    private Leg rightLeg;
    private Leg leftLeg;
    private Arm rightArm;
    private Arm leftArm;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getRightLeg() {
        return rightLeg;
    }

    public void setRightLeg(Leg rightLeg) {
        this.rightLeg = rightLeg;
    }

    public Leg getLeftLeg() {
        return leftLeg;
    }

    public void setLeftLeg(Leg leftLeg) {
        this.leftLeg = leftLeg;
    }

    public Arm getRightArm() {
        return rightArm;
    }

    public void setRightArm(Arm rightArm) {
        this.rightArm = rightArm;
    }

    public Arm getLeftArm() {
        return leftArm;
    }

    public void setLeftArm(Arm leftArm) {
        this.leftArm = leftArm;
    }
}

class Leg {
    private int length;
    private boolean isRaised;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isRaised() {
        return isRaised;
    }

    public void setRaised(boolean raised) {
        isRaised = raised;
    }
}

class Head {
    private int isAnyHair;
    private int colorOfEyes;

    public int getIsAnyHair() {
        return isAnyHair;
    }

    public void setIsAnyHair(int isAnyHair) {
        this.isAnyHair = isAnyHair;
    }

    public int getColorOfEyes() {
        return colorOfEyes;
    }

    public void setColorOfEyes(int colorOfEyes) {
        this.colorOfEyes = colorOfEyes;
    }
}

class Arm {
    private int length;
    private boolean isRaised;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isRaised() {
        return isRaised;
    }

    public void setRaised(boolean raised) {
        isRaised = raised;
    }
}
