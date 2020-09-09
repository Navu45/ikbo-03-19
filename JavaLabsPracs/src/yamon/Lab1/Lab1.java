package yamon.Lab1;

import java.util.Arrays;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args)
    {
        System.out.print("Введите от 1 до 5: ");
        int choice;
        switch (new Scanner(System.in).nextInt())
        {
            case 1: {
                task1();
                break;
            }
            case 2: {
                task2(args);
                break;
            }
            case 3: {
                task3();
                break;
            }
            case 4: {
                task4();
                break;
            }
            case 5: {
                task5();
                break;
            }
            default:
            {
                System.out.println("Неправильный ввод!");
            }

        }
    }

    private static void task1()
    {
        //for
        int[] mass = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < mass.length; i++) {
            sum += mass[i];
        }
        System.out.println(sum + " - for");

        //while
        sum = 0;
        int i = 0;
        while (i < mass.length) {
            sum += mass[i++];
        }
        System.out.println(sum + " - while");

        //do-while
        sum = 0;
        i = 0;
        do
        {
            sum += mass[i++];
        } while(i < mass.length);
        System.out.println(sum + " - do-while");
    }

    private static void task2(String[] args)
    {
        for (int i = 0; i < args.length; i++)
        {
            System.out.println(args[i]);
        }
    }

    private static void task3()
    {
        System.out.print("1, ");
        for (int i = 2; i <= 10; i++)
        {
            System.out.print("1/" + i + ", ");
        }
    }

    private static void task4()
    {
        int[] mass = new int[10];
        for (int i = 0; i < mass.length; i++)
        {
            mass[i] = (int)(Math.random() * 20);
        }
        System.out.println(Arrays.toString(mass));
        Arrays.sort(mass);
        System.out.println(Arrays.toString(mass));
    }

    private static void task5()
    {
        System.out.println("5! = " + factor(5));
    }

    private static int factor(int n)
    {
        int result = 1;
        for (int i = 2; i <= n; i++)
        {
            result *= i;
        }
        return result;
    }
}