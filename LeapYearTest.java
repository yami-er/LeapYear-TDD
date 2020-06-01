
import org.junit.Assert;
import org.junit.Test;
public class LeapYearTest {

    @Test
    public void leapYearDivisibleBy4() {
        Assert.assertTrue(LeapYear.IsLeapYear(1996));
    }

    @Test
    public void yearsNotDivisbleBy400() {
        Assert.assertFalse(LeapYear.IsLeapYear(2001));
    }

    @Test
    public void leapYearsNotDivisbleBy100() {
        Assert.assertFalse(LeapYear.IsLeapYear(1900));
    }

    @Test
    public void leapYearsDivisibleByFourHundred() {
        Assert.assertTrue(LeapYear.IsLeapYear(2000));
    }
}