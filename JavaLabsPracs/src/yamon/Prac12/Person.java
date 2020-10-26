package yamon.Prac12;

public class Person {
    private String[] fullName = new String[3];

    public Person(String firstName, String middleName, String lastName) {
        this.fullName[0] = firstName;
        this.fullName[1] = middleName;
        this.fullName[2] = lastName;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        boolean notFirst = false;
        for (String str :
                fullName) {
            if (!str.isEmpty()) {
                if (notFirst) {
                    builder.append(' ');
                }
                builder.append(str);
                notFirst = true;
            }
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        Person person1 = new Person("Алексей", "Александрович", "Ямончеряев");
        Person person2 = new Person("Алексей", "", "Ямончеряев");
        Person person3 = new Person("", "", "Ямончеряев");

        System.out.println(person1.toString() + '\n' + person2.toString() + '\n' + person3.toString());
    }
}
