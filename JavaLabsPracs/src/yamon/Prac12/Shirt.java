package yamon.Prac12;

public class Shirt {
    private String[] shirtParams;

    public Shirt(String shirtString) {
        shirtParams = new String[4];
        int i = 0;
        for (String s :
                shirtString.split(",")) {
            shirtParams[i++] = s;
        }
    }

    public Shirt() {
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "code=" + shirtParams[0] + ", " +
                "name=" + shirtParams[1] + ", " +
                "color=" + shirtParams[2] + ", " +
                "size=" + shirtParams[3] + ", " +
                '}';
    }
}
