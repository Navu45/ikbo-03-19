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

        sort(students, 0, students.length - 1);

        for (Student student: students){
            System.out.print(student.getName() + " = " + student.getGrade() + " ");
        }
        System.out.println();

    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.compareTo(o2);
    }

    public void quickSort(Student[] students, int left, int right)
    {
        int l_hold = left; //левая граница
        int r_hold = right; // правая граница
        int middle = (left + right) / 2;
        Student pivot = students[middle];

        while (l_hold < r_hold){
            while (compare(students[l_hold], pivot) < 0) l_hold++;
            while (compare(students[r_hold], pivot) > 0) r_hold--;

            if (l_hold < r_hold)
            {
                Student temp = students[l_hold];
                students[l_hold] = students[r_hold];
                students[r_hold] = temp;
                l_hold++; r_hold--;
            }
        }

        if (left < r_hold) quickSort(students, left, r_hold);
        if (right > l_hold) quickSort(students, l_hold, right);
    }
}
