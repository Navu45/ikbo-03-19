package yamon.Prac6;

class Student implements Comparable<Student>{
    private int ID;
    private String name;
    private int grade;

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.grade, o.getGrade());
    }

    public Student(int ID, String name) {
        this.ID = ID;
        this.name = name;
        grade = 0;
    }

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        ID = 0;
    }

    public int getID() {
        return ID;
    }

    public int getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
