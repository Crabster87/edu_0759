import java.util.stream.Stream;

public class Contribution {

    private final double value;
    private final double percentage;

    public Contribution(double value, double percentage) {
        this.value = value;
        this.percentage = percentage;
    }

    public Double[] calculateEachYearVolume() {
        return Stream.iterate(value + Math.round(value * percentage / 100),
                              aDouble -> aDouble + Math.round(aDouble * percentage / 100))
                     .limit(5)
                     .toArray(Double[]::new);
    }

}
