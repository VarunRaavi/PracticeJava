import java.sql.SQLOutput;

public class DayOfTheWeek {
    public static void main(String[] args) {
printDayOfWeek(1);
printDayOfWeek(2);
printDayOfWeek(3);
printDayOfWeek(4);
printDayOfWeek(5);
printDayOfWeek(39);
printWeekDay(1);
printWeekDay(2);
printWeekDay(3);
printWeekDay(4);
printWeekDay(5);
printWeekDay(344);
    }

    public static String printDayOfWeek(int day) {
        String dayOfTheWeek = "Invalid";
        switch (day) {
            case 0 -> {
                dayOfTheWeek = "Sunday";
                return dayOfTheWeek;
            }
            case 1 -> {
                dayOfTheWeek = "Monday";
                System.out.println(dayOfTheWeek);
                return dayOfTheWeek;
            }
            case 2 -> {
                dayOfTheWeek = "Tuesday";
                System.out.println(dayOfTheWeek);
                return dayOfTheWeek;
            }
            case 3 -> {
                dayOfTheWeek = "Wednesday";
                System.out.println(dayOfTheWeek);
                return dayOfTheWeek;
            }
            case 4 -> {
                dayOfTheWeek = "Thursday";
                System.out.println(dayOfTheWeek);
                return dayOfTheWeek;
            }
            case 5 -> {
                dayOfTheWeek = "Friday";
                System.out.println(dayOfTheWeek);
                return dayOfTheWeek;
            }
            case 6 -> {
                dayOfTheWeek = "Saturday";
                return dayOfTheWeek;
            }
            default -> {
                System.out.println(dayOfTheWeek);
                return dayOfTheWeek;
            }
        }
    }
    public static String printWeekDay (int day){
        String dayOfTheWeek = "Invalid";
        if (day == 0){
            dayOfTheWeek = "Sunday";
           // System.out.println(dayOfTheWeek);
        } else if (day==1) {
            dayOfTheWeek ="Monday";
           // System.out.println(dayOfTheWeek);
        }else if (day==2) {
            dayOfTheWeek ="Tuesday";
            //System.out.println(dayOfTheWeek);
    }else if (day==3) {
            dayOfTheWeek = "Wednesday";
            //System.out.println(dayOfTheWeek);
        }else if (day==4) {
            dayOfTheWeek = "Thursday";
           // System.out.println(dayOfTheWeek);
        }else if (day==5) {
            dayOfTheWeek = "Friday";
           // System.out.println(dayOfTheWeek);
        }else if (day==6) {
            dayOfTheWeek = "Saturday";
            //System.out.println(dayOfTheWeek);
        }
        System.out.println(dayOfTheWeek);
        return dayOfTheWeek;
    }
}
