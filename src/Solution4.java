public class Solution4 {
    public static void main(String[] args){
        System.out.printf("Binary String is %s and solution is %s",Integer.toBinaryString(955),solution(955));
        System.out.println(" <-----------------");
        System.out.printf("Binary String is %s and solution is %s",Integer.toBinaryString(255),solution(255));
        System.out.println(" <-----------------");
        System.out.printf("Binary String is %s and solution is %s",Integer.toBinaryString(682),solution(682));
        System.out.println(" <-----------------");
        System.out.printf("Binary String is %s and solution is %s",Integer.toBinaryString(953),solution(953));
        System.out.println(" <-----------------");
        System.out.printf("Binary String is %s and solution is %s",Integer.toBinaryString(45),solution(45));
        System.out.println(" <-----------------");
        System.out.printf("Binary String is %s and solution is %s",Integer.toBinaryString(2457),solution(2457));
        System.out.println(" <-----------------");
        System.out.printf("Binary String is %s and solution is %s",Integer.toBinaryString(1),solution(1));
        System.out.println(" <-----------------");
        System.out.printf("Binary String is %s and solution is %s",Integer.toBinaryString(0),solution(0));
        System.out.println(" <-----------------");
        System.out.printf("Binary String is %s and solution is %s",Integer.toBinaryString(758),solution(758));
        System.out.println(" <-----------------");
        System.out.printf("Binary String is %s and solution is %s",Integer.toBinaryString(374),solution(374));
        System.out.println(" <-----------------");
        System.out.printf("Binary String is %s and solution is %s",Integer.toBinaryString(182),solution(182));
        System.out.println(" <-----------------");
    }
    static int solution(int n) {
        int[] d = new int[30];
        int l = 0;
        int p;
        while (n > 0) {
            d[l] = n % 2;
            n /= 2;
            l++;
        }
        // Handle one element case.
        if(l==1){
            return -1;
        }
        for (p = 1; p <= (1 + l)/2; ++p) {
            int i;
            boolean ok = true;
            for (i = 0; i < l - p; ++i) {
                if (d[i] != d[i + p]) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                return p;
            }
        }
        return -1;
    }
}
