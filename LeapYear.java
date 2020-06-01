
public class LeapYear{

    public boolean isLeapYear(int year) 
    { 
        // If a year is muliplt of 4 and 400 but not 100 then it is a leap year 
        if ((year % 4 == 0) &&((year % 100 !=0) ||(year % 400 == 0))){ 
        return true;
        }else{
            return false;
        }
    }
    
}