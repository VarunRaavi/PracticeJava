import java.util.WeakHashMap;

public class NumberInWord {
    public static void main(String[] args) {
        printNumberInWord(5);
        printNumberInWord(-100);
        printNumberInWord(0);
        printNumberInWord(89);
        printNumberInWord(1);
    }
    public static void printNumberInWord(int number){
        String word;
        switch (number) {
            case 0:
                word = "Zero";
                break;
            case 1:
                word = "one";
                break;
            case 2:
                word = "two";
                break;
            case 3:
                word = "three";
                break;
            case 4:
                word = "four";
                break;
            case 5:
                word = "five";
                break;
            case 6:
                word = "six";
                break;
            case 7:
                word = "seven";
                break;
            case 8:
                word = "eight";
                break;
            case 9:
                word = "nine";
                break;
            default:
                word = "other";
                break;
        }
        System.out.println(number+ " is " +word);
    }
}
