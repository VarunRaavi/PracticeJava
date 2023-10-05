//import static java.lang.Math.*;

public class SpeedConverter {
    public static void main(String[] args) {
        toMilesPerHour(1.5);
        toMilesPerHour(10.25);
        toMilesPerHour(-5.6);
        toMilesPerHour(25.42);
        toMilesPerHour(75.114);
        toMilesPerHour(95.75);
        toMilesPerHour(0);
        printConversion(1.5);
        printConversion(75.114);
        printConversion(0.0);
        printConversion(95.75);

    }
    public static long toMilesPerHour(double kilometersPerHour) {
        long mph = 0 ;
        if (kilometersPerHour < 0) {
            System.out.println(mph = -1);
        } else if (kilometersPerHour > 0) {
            System.out.println(mph = Math.round(kilometersPerHour /  1.609));
        }
        return mph;
    }
    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour > 0){
        System.out.println(kilometersPerHour +" km/h" + " = " + Math.round(kilometersPerHour /  1.609) + " mi/h" );
    }
    else if(kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else{
            System.out.println(kilometersPerHour +" km/h" + " = "  + "0 mi/h" );
        }
    }
}
