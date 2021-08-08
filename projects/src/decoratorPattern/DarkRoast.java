package decoratorPattern;

public class DarkRoast extends Beverage {

    public DarkRoast(){
        description = "dark roast cofee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
