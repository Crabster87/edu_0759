import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContributionTest {

    Contribution contribution1 = new Contribution(10_000, 11);
    Contribution contribution2 = new Contribution(500_000, 6.5);
    Contribution contribution3 = new Contribution(1_700_000, 3.8);

    /**
     * positive cases
     */

    @Test
    void calculateVolume() {
        Assertions.assertArrayEquals(new Double[]{11_100.0, 12_321.0, 13_676.0, 15_180.0, 16_850.0},
                contribution1.calculateEachYearVolume());
        Assertions.assertArrayEquals(new Double[]{532_500.0, 567_113.0, 603_975.0, 643_233.0, 68_5043.0},
                contribution2.calculateEachYearVolume());
        Assertions.assertArrayEquals(new Double[]{1_764_600.0, 1_831_655.0, 1_901_258.0, 1_973_506.0, 2_048_499.0},
                contribution3.calculateEachYearVolume());

    }

}