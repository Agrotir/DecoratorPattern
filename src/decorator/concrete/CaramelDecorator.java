package decorator.concrete;

import decorator.AddOnDecorator;
import decorator.Beverage;

public class CaramelDecorator extends AddOnDecorator {

    Beverage beverage;

    public CaramelDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return "Juciy caramel";
    }

    @Override
    public int getCost() {
        return this.beverage.getCost() + 2;
    }

}
