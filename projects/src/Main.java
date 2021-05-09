import observerPattern.CurrentCondition;
import observerPattern.Statistics;
import observerPattern.WeaterData;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        
        /*
        test Observer Pattern
         */

        WeaterData weaterData = new WeaterData();
        CurrentCondition currentCondition = new CurrentCondition(weaterData);
        Statistics statistics = new Statistics(weaterData);
        weaterData.subscribeObserver(currentCondition);
        weaterData.subscribeObserver(statistics);

        weaterData.updateData(10,20,30);
        weaterData.updateData(15,30,10);
        weaterData.unSubscribeObserver(statistics);
        weaterData.updateData(8,10,10);
        weaterData.updateData(15,6,9);


    }
}
