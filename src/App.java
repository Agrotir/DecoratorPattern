import decorator.Beverage;
import decorator.FancyDrink;
import decorator.concrete.CaramelDecorator;

public class App {
    public static void main(String[] args) throws Exception {
        Beverage beverage = new FancyDrink();
        CaramelDecorator caramelDecorator = new CaramelDecorator(beverage);

        System.out.println(caramelDecorator.getCost());

        CaramelDecorator caramelDecorator2 = new CaramelDecorator(caramelDecorator);

        System.out.println(caramelDecorator2.getCost());
    }
}
