public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        isLeapYear(1924);
        getDaysInMonth(2, 2024);
        getDaysInMonth(2,2020);
        getDaysInMonth(1,1992);
        getDaysInMonth(3,1900);
        getDaysInMonth(4,2000);
        getDaysInMonth(1000,3000);
    }
    public static boolean isLeapYear(int year) {
        boolean result = false;
        boolean b = ((year % 4 == 0) &&
                ((year % 100 != 0) ||
                        (year % 400 == 0)));
        if (year <= 1 || year >= 9999) {
          //  System.out.println(false);
        } else if (b) {
          //  System.out.println("true");
        } else {
          //  System.out.println("false");
        }
        return result;
    }
    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        } else
            switch (month) {// System.out.println("31");
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 2:
                    if (isLeapYear(year) == true) {
                        return 29;
                    } else
                        return 28;
//  System.out.println("30");
                case 4:
                case 6:
                case 9:
                case 11:
                    break;
            }
        return 30;
    }
}