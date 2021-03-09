import java.util.function.Consumer;

public class Prac1 {

    public static void main(String[] args) {
        Consumer<String> thirdLetterUp = x -> {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < x.length() - 1; i++) {
                if ((i + 1) % 3 == 0) {
                    result.append(x.toUpperCase().charAt(i));
                }
                else result.append(x.charAt(i));
            }
            System.out.println(result.toString());
        };

        thirdLetterUp.accept("dmoadsnfjadsoi");

        
    }

}


