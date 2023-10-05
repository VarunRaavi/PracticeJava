public class ConvertToCM {
    public static void main(String[] args) {

        double htInCm =  convertToCentimeters((int) convertToCentimeters(5,11));
        System.out.println("Height in cm is " + htInCm);

    }
    public static double convertToCentimeters(int heightInInches){
        double conversion = (double)(heightInInches * 2.54);
        return conversion;
    }
    public static double convertToCentimeters(int heightInFeet, int heightInInches) {
        int convertFeetToInches = ((heightInFeet*12)+heightInInches);
        return convertFeetToInches;

    }
}
