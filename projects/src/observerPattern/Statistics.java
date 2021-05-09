package observerPattern;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Statistics implements Observer{

    private WeaterData weaterData;
    private List<Float> temperaturs = new ArrayList<>();

    public Statistics(WeaterData weaterData) {
        this.weaterData = weaterData;
    }

    @Override
    public void update() {
        temperaturs.add(weaterData.getTemperature());
        IntSummaryStatistics statistics = temperaturs.stream().mapToInt(t->Math.round(t))
                .summaryStatistics();
        System.out.println("AVG/MAX/MIN temperatures " + statistics.getAverage() + "/"+ statistics.getMax() + "/"
        + statistics.getMin());
    }
}
