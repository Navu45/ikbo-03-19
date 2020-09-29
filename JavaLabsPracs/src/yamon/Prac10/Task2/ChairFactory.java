package yamon.Prac10.Task2;

public class ChairFactory implements AbstractChairFactory{
    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair(200);
    }

    @Override
    public MagicChair createMagicChair() {
        return null;
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return null;
    }
}
