public class LeapYear {
    public static void main(String[] args) {
        IsleapYear(-1600);
        IsleapYear(1600);
        IsleapYear(2017);
        IsleapYear(2000);
        IsleapYear(2400);
        IsleapYear(2020);
        IsleapYear(1924);
    }
    public static boolean IsleapYear(int year){
        boolean result = false;
        boolean b = ((year % 4 == 0) &&
                ((year % 100 != 0) ||
                        (year % 400 == 0)));
        if(year <=1 || year>=9999){
            System.out.println(false);}
         else if(b==true ){
            System.out.println("true");
            }
            else{
                System.out.println("false");
                }
        return false;
    }
}
