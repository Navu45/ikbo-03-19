package yamon.Lab3;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.out;

public class FurnitureShop {
    public static void main(String[] args) {
        Bookcase bookcase = new Bookcase(10000, new int[]{40, 200, 185});
        KitchenTable kitchenTable = new KitchenTable(2000, new int[]{140, 70, 90}, "brown", "wood");
        Scanner in = new Scanner(System.in);
        int balance;


        out.print("Введите свой баланс: ");
        balance = in.nextInt();

        out.print("Что вы хотите купить?\n1) Кухонный стол;\n2) Книжный шкаф.\nВведите число: ");
        if(in.nextInt() == 1){
            out.println("\nВы выбрали стол! Вот параметры стола:\n" + kitchenTable.toString());
            out.println("Вы действительно хотите купить этот стол? Введите 0 или 1 (1 - покупка, 0 - отказ)");
            int choice = in.nextInt();
            if(choice == 1 && balance >= kitchenTable.getPrice()) {
                out.println("Поздравляем с покупкой!!!");
            }
            else if (choice == 0) {
                out.println("Нам очень жаль, что вам ничего не подошло");
            }
            else {
                out.println("Не хватает средств!");
            }
        }
        else {
            out.println("\nВы выбрали книжный шкаф! Вот параметры шкафа:\n" + bookcase.toString());
            out.println("К тому у шкафу есть дверки. Вот.");
            bookcase.openTheDoor();
            bookcase.closeTheDoor();
            out.println("Вы действительно хотите купить этот шкаф? Введите 0 или 1 (1 - покупка, 0 - отказ)");
            int choice = in.nextInt();
            if(choice == 1 && balance >= bookcase.getPrice()) {
                out.println("Поздравляем с покупкой!!!");
            }
            else if (choice == 0) {
                out.println("Нам очень жаль, что вам ничего не подошло");
            }
            else {
                out.println("Не хватает средств!");
            }
        }


    }
}

abstract class Furniture {
    private int price;
    private String location;
    private int[] dimensions;

    Furniture(int price, String location, int[] dimensions) {
        this.price = price;
        this.location = location;
        this.dimensions = dimensions;
    }

    int getPrice() {
        return price;
    }

    String getLocation() {
        return location;
    }

    int[] getDimensions() {
        return dimensions;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "price=" + price +
                ", location='" + location + '\'' +
                ", dimensions=" + Arrays.toString(dimensions) +
                '}';
    }
}

class Bookcase extends Furniture{

    private boolean isDoorsOpened = false;

    Bookcase(int price, int[] dimensions) {
        super(price, "living room", dimensions);
    }
    
    boolean isOpened() {
        return isDoorsOpened;
    }

    void openTheDoor() {
        isDoorsOpened = true;
        out.println("*Дверки открыты.*");
    }

    void closeTheDoor() {
        isDoorsOpened = false;
        out.println("*Дверки закрыты.*");
    }
}

class KitchenTable extends Furniture{

    private String color;
    private String material;

    KitchenTable(int price, int[] dimensions, String color, String material) {
        super(price, "kitchen", dimensions);
        this.color = color;
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "KitchenTable{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", price='" + getPrice() + '\'' +
                ", location='" + getLocation() + '\'' +
                ", dimensions='" + Arrays.toString(getDimensions()) + '\'' +
                '}';
    }
}