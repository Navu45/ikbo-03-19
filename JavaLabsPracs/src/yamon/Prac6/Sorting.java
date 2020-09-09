package yamon.Prac6;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        Student[] students = new Student[10];

        for (int i = 0; i < 10; i++) {
            students[i] = new Student((int)(Math.random() * 256), i + "Luke");
        }
        System.out.println(Arrays.toString(students));
        selectionSort(students);
        System.out.println(Arrays.toString(students));
    }

    private static void selectionSort(Comparable[] list) {
        int min;
        Comparable temp;
        for (int index = 0; index < list.length-1; index++)
        {
            min = index;
            for (int scan = index+1; scan < list.length; scan++)
                if (list[scan].compareTo(list[min]) < 0)
                    min = scan;
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }
}

