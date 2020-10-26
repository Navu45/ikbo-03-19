package yamon.Prac12;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Address {
    private static final String[] order = {"country","region", "city", "street", "house", "building", "apartment"};

    private HashMap<String, String> map = new HashMap<>();

    public Address() {
        for (String key :
                order) {
            map.put(key, "");
        }
    }

    public void create(String[] s) {
        int i = 0;
        for (String key :
                order) {
            if (i < s.length)
                map.put(key, s[i++]);
        }
    }

    public void create(StringTokenizer s) {
        for (String key :
                order) {
            if (s.hasMoreTokens())
                map.put(key, s.nextToken());
        }
    }

    private static void taskA(String str) {
        String[] s = str.split(",");
        Address address = new Address();
        address.create(s);

        System.out.println(address.map.entrySet());
    }

    private static void taskB(String str) {
        StringTokenizer st = new StringTokenizer(str, ",;.-");
        Address address = new Address();
        address.create(st);

        System.out.println(address.map.entrySet());
    }

    public static void main(String[] args) {
        String str = "Russia,Moscow,,prospekt Vernadskogo,78";
                //new Scanner(System.in).nextLine();
        System.out.println("Task1");
        taskA(str);

        str = "Russia;Moscow;;prospekt Vernadskogo;78";
        System.out.println("Task2");
        taskB(str);
    }
}
