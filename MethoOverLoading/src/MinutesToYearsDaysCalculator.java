public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(561600);
        printYearsAndDays(1051200);
        printYearsAndDays(525600);
        printYearsAndDays(0);
    }
public static void printYearsAndDays(long minutes){
        if (minutes >= 0){
            int hour = (int)(minutes / 60);
            int remainingMin = hour%60;
          //  System.out.println(remainingMin);
            int day = (hour/24);
          //  System.out.println(day%365);
            int remainingDays = (day%24);
          //  System.out.println(remainingDays);
            int year = day/365;
            System.out.println(minutes +" min "+ "= " + year + " y "+ (day%365) +" d ");
        }
        else {
            System.out.println( "invalid");
        }
}
}

