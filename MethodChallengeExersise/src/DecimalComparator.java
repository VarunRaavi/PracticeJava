public class DecimalComparator {
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(-3.1753,-3.176);
        areEqualByThreeDecimalPlaces(-3.1756,-3.175);
        areEqualByThreeDecimalPlaces(3.0, 3.0);
        areEqualByThreeDecimalPlaces(-3.123,3.123);
        areEqualByThreeDecimalPlaces(1.112,1.113);

    }
    public static boolean areEqualByThreeDecimalPlaces(double a, double b){
        boolean result = false;
        if((a * 1000) == (b*1000)){
            result = true;
            System.out.println(result);
        }
        else {
            result=false;
            System.out.println(false);
        }



        return result;
    }
}
