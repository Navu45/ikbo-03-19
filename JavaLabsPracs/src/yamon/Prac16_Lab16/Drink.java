package yamon.Prac16_Lab16;

public final class Drink extends Item implements Alcoholable {

    private final double alcoholVol;
    private final DrinkTypeEnum type;

    public Drink(double alcoholVol, DrinkTypeEnum type, int price, String name, String description) {
        super(price, name, description);
        this.alcoholVol = alcoholVol;
        this.type = type;
    }

    public DrinkTypeEnum getType() {
        return type;
    }

    @Override
    public boolean isAlcoholicDrink() {
        return alcoholVol != 0;
    }

    @Override
    public double getAlcoholVol() {
        return alcoholVol;
    }
}

