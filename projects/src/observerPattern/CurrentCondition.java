package observerPattern;

public class CurrentCondition implements Observer{

    private WeaterData weaterData;

    public CurrentCondition(WeaterData weaterData) {
        this.weaterData = weaterData;
    }

    @Override
    public void update() {
        System.out.println("current Condition " + weaterData.getTemperature()  + " F degrees and humidity " +
                weaterData.getHumidity() + " and pressure "+weaterData.getPresure());
    }
}
