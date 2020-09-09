package yamon.Prac5;

import java.io.IOException;
import java.util.Scanner;

public class Prac5 {
    public static void main(String[] args) throws IOException {

        switch (new Scanner(System.in).nextInt()){
            case 1:
            {
                //Task1
                System.out.print("Введите число для №13 задания: ");
                task1();
                System.out.print("\n");
                break;
            }
            case 2:
            {
                //Task2
                System.out.print("Введите число для №14 задания: ");
                task2();
                System.out.println();
                break;
            }
            case 3:
            {
                //Task3
                System.out.print("Введите число для №15 задания: ");
                task3(new Scanner(System.in).nextInt(), 1);
                System.out.println();
                break;
            }
            case 4:
            {
                //Task4
                System.out.print("Введите число для №16 задания: ");
                task4(new int[10]);
                System.out.println();
                break;
            }
            case 5:
            {
                //Task5
                System.out.print("Введите число для №17 задания: ");
                System.out.println(task5());
                break;
            }
        }
    }

    private static void task1() throws IOException {
        char c = (char)System.in.read();
        if (c == '0') return;
        System.out.print(c);
        if (System.in.read() == '0') return;
        task1();
    }

    private static void task2() throws IOException {
        char c = (char)System.in.read();
        if (c == '\n') return;
        System.out.print(c);
        System.out.print(' ');
        task2();
    }

    private static void task3(int num, int n) {
        if (num / (int)Math.pow(10, n - 1) == 0) return;
        System.out.print(num % (int)Math.pow(10, n) / (int)Math.pow(10, n - 1));
        task3(num, n + 1);
    }

    private static void task4(int[] numerals) throws IOException {
        int i = ((char)System.in.read()) - '0';
        if (i == 0)
        {
            int max = 0;
            for (int element: numerals){
                if (max < element) max = element;
            }
            System.out.println("Количество максимальных элементов = " + max);
            return;
        }
        numerals[i]++;
        task4(numerals);
    }

    private static int task5() throws IOException {
        int i = ((char)System.in.read()) - '0';
        if (i == 0)
        {
            return 0;
        }
        else return Math.max(i, task5());
    }
}
