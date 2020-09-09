package yamon.Prac2;

import static java.lang.System.out;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Nike", "nike@gmail.com", 'm');
        out.println(author.toString());
    }

}

