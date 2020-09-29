package yamon.Lab9;

import java.util.Scanner;

public class MyException {
    public void exceptionDemo() {
        System.out.println( 2 / 0 );
    }

    public void exceptionDemo1() {
        try{
            System.out.println( 2 / 0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
    }
    public static void main(String[] args) {
        new MyException().exceptionDemo2();
    }

    public void exceptionDemo2() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.nextLine();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (NullPointerException ex) {
            System.err.println("Enter an integer!");
        }
        finally {
            System.err.println("I dont know what you did wrong...");
        }
    }
}
