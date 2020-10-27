package yamon.Prac16_Lab16;

public class Item {
    private final int price;
    private final String name;
    private final String description;

    public Item(int price, String name, String description) {
        if (price < 0 || name.isBlank() || description.isBlank()) {
            throw new IllegalArgumentException(
                    (price < 0 ? "Цена не может быть меньше нуля!;\n" : "") +
                    (name.isBlank() ? "Название напитка не может быть пустым!\n" : "") +
                    (description.isBlank() ? "Описание не может быть пустым!;": ""));
        }
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
