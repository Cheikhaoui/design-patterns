package decoratorPattern;

public class Decafe extends Beverage {

    public Decafe(){
        description = "decafe  cafee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
