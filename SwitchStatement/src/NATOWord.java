public class NATOWord {
    public static void main(String[] args) {
        char charValue = 'j';
        switch (charValue) {
            case 'A' -> System.out.println("Able");
            case 'B' -> System.out.println("Baker");
            case 'C' -> System.out.println("Charlie");
            case 'D' -> System.out.println("Dog");
            case 'E' -> System.out.println("Easy");
            default -> System.out.println(charValue + " is not found ");
        }
    }
}
