package decorator;

public class FancyDrink extends Beverage {

    @Override
    public String getDesc() {
        return "Fanciest drink in town";
    }

    @Override
    public int getCost() {
        return 10;
    }

}
