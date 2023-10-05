public class Test {
    public static void main(String[] args) {
        int year = 2000;
        boolean b = ((year % 4 == 0) &&
                ((year % 100 != 0) ||
                (year % 400 == 0)));
        if(b == true){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}