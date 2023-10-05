public class MegabytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(0);
        printMegaBytesAndKiloBytes(5000);
    }
        public static void printMegaBytesAndKiloBytes(int kiloBytes){
            int mb = 1024;
            if(kiloBytes < 0){
                System.out.println("Invalid Value");
            } else if (kiloBytes > 0) {
                System.out.println(kiloBytes + " KB " + (kiloBytes/mb) +" MB " + (kiloBytes%mb) + " KB ");
            } else {
                System.out.println("0");
            }
        }

}
