package yamon.Prac6;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.Arrays.sort;

public class SortingStudentsByGPA implements Comparator<Student> {

    public static void main(String[] args) {

        SortingStudentsByGPA sort = new SortingStudentsByGPA();
        Student[] students = new Student[10];

        for (int i = 0; i < 10; i++) {
            students[i] = new Student(i + "Luke", (int)(Math.random() * 100));
        }

        for (Student student: students){
            System.out.print(student.getName() + " = " + student.getGrade() + " ");
        }
        System.out.println();

        sort(students, 0, students.length);

        for (Student student: students){
            System.out.print(student.getName() + " = " + student.getGrade() + " ");
        }
        System.out.println();

    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.compareTo(o2);
    }


}
