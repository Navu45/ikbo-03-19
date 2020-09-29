package yamon.Lab8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyFileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("C:\\Users\\Алексей\\src" +
                "\\Java_repos\\ikbo-03-19\\JavaLabsPracs\\src\\yamon\\Lab8\\file.txt",false);
        writer.write(new Scanner(System.in).nextLine());
        writer.flush();
    }
}
