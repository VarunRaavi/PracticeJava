public class BarkingDog {
    public static void main(String[] args) {
        shouldWakeUp(true,23);
        shouldWakeUp(true,7);
        shouldWakeUp(true,4);
        shouldWakeUp(true, 22);
        shouldWakeUp(true, 0);

    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        boolean k = false;
        if((hourOfDay <= 0 && hourOfDay >= 23)){
            System.out.println(k);
        } else if (barking==true && (hourOfDay <= 8 || hourOfDay >= 22) ) {
            k= true;
            System.out.println(k);
        } else if (!barking) {
            System.out.println("dog is not barking");
        }else {
            System.out.println("false");
        }
        return k;
}
}
