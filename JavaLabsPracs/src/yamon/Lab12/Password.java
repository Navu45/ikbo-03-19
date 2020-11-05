package yamon.Lab12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    Pattern pattern = Pattern.compile("((?=\\w*[A-Z])(?=\\w*\\d)(?=\\w*[a-z])\\w{8,})");
    String password;

    public Password(String password) {
        this.password = password;
    }

    public boolean isCorrect() {
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String password_str = new Scanner(System.in).nextLine();
        Password password = new Password(password_str);
        if (password.isCorrect()) {
            System.out.println("Пароль корректен");
        }
        else {
            System.out.println("Пароль некорректен");
        }
    }
}
