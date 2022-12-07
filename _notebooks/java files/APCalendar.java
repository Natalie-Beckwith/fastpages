/**
 * AP CSA CB FRQ 2019
 * 
 * @author Natalie Beckwith
 * @version 1
 */

import java.util.Scanner;

/**
 * Main class for APCalendar.java
 *
 */
public class APCalendar
{
    /**
     * Returns true if year is a leap year and false otherwise 
     * 
     * @param year
     * @return
     */
    private static boolean isLeapYear(int year)
    {
        if ((year % 4 == 0) || // must occur every 4th year
                (year % 100 == 0) || // must be divisible by 100
                (year % 400 == 0)) // must be divisible by 400
        {
            return true;
        }
        else return false;   
    }
    
    
    /**
     * Returns number of leap years between year1 and year2,
     * inclusive 
     * 
     * 0 <= year1 <= year2
     * 
     * @param year1
     * @param year2
     * @return leapYear
     */
    public static int numberofLeapYears(int year1, int year2)
    {
        int leapYear = 0;
        
        for(int loop = year1; loop <= year2; loop++)
        {
            if ((loop % 4 == 0) || // must occur every 4th year
                (loop % 100 == 0) || // must be divisible by 100
                (loop % 400 == 0)) // must be divisible by 400
            {
                leapYear++; // increases number of leap years
            }
        }
        return leapYear;
    }
    
    /**
     * Returns the value representing the day of the week for
     * the first day of year, where 0 denotes Sunday, 1 denotes
     * Monday, ..., and 6 denotes Saturday 
     * 
     * @param month
     * @param day
     * @param year
     * @return 1
     */
    private static int firstDayOfYear(int year)
    {
        return 1;
    }
    
    /**
     * Returns n, where month, day, and year specify the nth
     * day of the year. Returns 1 for January 1 (Monday = 1,
     * day = 1) of any year 
     * 
     * @param month
     * @param day
     * @param year
     * @return 1
     */
    private static int dayOfYear(int month, int day, int year)
    {        
        return 1;
    }
    
    
    /**
     * Returns the value representing the day of the week for
     * the given date, (month, day, year) where 0 denotes Sunday,
     * 1 denotes Monday, ..., and 6 denotes Saturday
     * 
     * @param the given month
     * @param the given day
     * @param the given year
     * @return dayOfWeek
     */
    public static int dayofWeek(int month, int day, int year)
    {
        // assuming that firstDayOfYear() is implemented
        int firstDay = firstDayOfYear(year);
        // assuming that dayOfYear() is implemented
        int numDays = dayOfYear(month, day, year);
        
        // subtract 1 so days of year start at 0
        int addDays = (firstDay + numDays) - 1;
        
        // 7 represents the number of days in a week
        int dayOfWeek = addDays % 7;
        
        return dayOfWeek;
    }
    
    /**
     * main method
     * 
     * @param Args
     */
    public static void main (String[] Args)
    {
        final int YEAR = 2022;
        final int YEAR_1;
        final int YEAR_2;

        // array of the days of the week
        final String[] DAYS = {"Sunday", "Monday",
                "Tuesday", "Wednesday", "Thursday",
                "Friday", "Saturday"};
        
        final int THE_MONTH = 11;
        final int THE_DAY = 14;
        final int THE_YEAR = 2022;
        
        // PART A
        System.out.printf("PART A:\n");
        boolean isLeapYear = isLeapYear(YEAR);
        System.out.printf("%d: %b\n",YEAR, isLeapYear);
        
        // user can type years to find number of leap years
        Scanner scanner = new Scanner(System.in);
        
        // lower bound
        System.out.printf("Enter the first year: ");
        YEAR_1 = scanner.nextInt();
        
        // upper bound
        System.out.printf("Enter the next year: ");
        YEAR_2 = scanner.nextInt();
        
        scanner.close();
        
        int numLeapYears = numberofLeapYears(YEAR_1, YEAR_2);
        System.out.printf("There are %d leap years between %d and %d\n\n",
                numLeapYears, YEAR_1, YEAR_2);
        
        // PART B
        System.out.printf("PART B:\n");
        int day = dayofWeek(THE_MONTH, THE_DAY, THE_YEAR);
        System.out.printf("%d/%d/%d is on a %s\n", THE_MONTH, THE_DAY, THE_YEAR, DAYS[day]);
    }
}
