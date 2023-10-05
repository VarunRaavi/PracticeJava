public class TeenNumberChecker {
    public static void main(String[] args) {
        isTeen(13);
        isTeen(14);
        isTeen(15);
        isTeen(16);
        isTeen(17);
        isTeen(18);
        isTeen(19);
        isTeen(20);
        isTeen(9);
    }
    public static boolean hasTeen(int a, int b, int c){
        boolean res = false;
        boolean d = ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19));
        if(d==true ){
            res = true;
            System.out.println(res);
        }
        else {
            System.out.println(res);
        }
        return res;
    }
    public static boolean isTeen(int num){
       boolean res = false;
        if (num >=13 && num <=19){
             res = true;
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
        return false;
    }
}
