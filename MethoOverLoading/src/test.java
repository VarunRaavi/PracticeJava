public class test {
    public static void main(String[] args) {
        jsfd(39080000);
    }
    public static void jsfd(long minutes){
        int hour = (int)(minutes / 60);
        System.out.println(hour);
        int remainingHours = hour%60;
        System.out.println(remainingHours);
        int day = (hour/24);
        System.out.println(day);
        int remainingDays = (day%24);
        System.out.println(remainingDays);
        int year = day/365;
        System.out.println(year);
        System.out.println(remainingHours +" xx "+ remainingDays+ " yy " + year + " zz ");
    }
}
