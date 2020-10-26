package yamon.Prac16;

public final class Drink extends Item implements Alcoholable {

    private double alcoholVol;
    private DrinkTypeEnum type;

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

