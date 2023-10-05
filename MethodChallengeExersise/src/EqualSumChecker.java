public class EqualSumChecker {
    public static void main(String[] args) {
        hasEqualSum(1,1,2);
        hasEqualSum(1,1,1);
    }

    public static boolean hasEqualSum(int a, int b, int c){
        boolean res = false;
        if(a + b == c){
            res = true;
            System.out.println(res);
        }
        return res;
    }
}
