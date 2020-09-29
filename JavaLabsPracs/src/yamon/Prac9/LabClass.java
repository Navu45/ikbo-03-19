package yamon.Prac9;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class LabClass {
    private final ArrayList<Student> listOfStudents;
    Student requiredStudent = null;

    public LabClass() {
        this.listOfStudents = new ArrayList<>();
    }

    public void add(Student student) {
        listOfStudents.add(student);
    }

    public Student find(String name) throws StudentNotFoundException {

        listOfStudents.forEach(student -> {
            if (student.getName().equals(name))
                requiredStudent = student;
        });
        if (requiredStudent == null) {
            throw new StudentNotFoundException("Студент " + name + " не найден!");
        }
        return requiredStudent;
    }

    public Student remove() {
        return listOfStudents.remove(0);
    }

    public boolean isEmpty() {
        return listOfStudents.isEmpty();
    }
}
