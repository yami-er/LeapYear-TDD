
public class LeapYear {
    public static boolean IsLeapYear(int year) {
        if (isMultipleOf4(year) && ((isMultipleOf400(year))||(isNotDivisbleBy100(year)))) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isMultipleOf4(int year) {
        return year % 4 == 0;
    }
    private static boolean isMultipleOf400(int year) {
        return year % 400 == 0;
    }
    private static boolean isNotDivisbleBy100(int year) {
        return year % 100 != 0;
    }

}