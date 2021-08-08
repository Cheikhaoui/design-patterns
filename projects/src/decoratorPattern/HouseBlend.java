package decoratorPattern;

public class HouseBlend extends Beverage{

    public HouseBlend(){
        description = "House Blend Cofee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
