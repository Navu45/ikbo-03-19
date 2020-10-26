package yamon.Prac12;

public class PhoneNumber {
    private String number;

    public PhoneNumber(String number) {

        StringBuilder builder = new StringBuilder().append("+");

        int i = 1;
        if (Character.isDigit(number.charAt(0))) {
            builder.append(7);
        }
        else {
            builder.append(number.charAt(1));
            i = 2;
        }

        int n = 0;
        for (; i < number.length(); i++, ++n) {
            if (n % 3 == 0 && n <= 6 && n > 1) {
                builder.append('-');
            }
            builder.append(number.charAt(i));
        }
        this.number = builder.toString();
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "number='" + number + '\'' +
                '}';
    }

    public static void main(String[] args) {
        String[] numbers = {
                "+79147364277",
                "89123124551",
                "+41242352455"
        };

        for (String number :
                numbers) {
            PhoneNumber phoneNumber = new PhoneNumber(number);
            System.out.println(phoneNumber.toString());
        }
    }
}
