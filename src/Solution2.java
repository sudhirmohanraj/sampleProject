import com.sun.tools.corba.se.idl.InterfaceGen;

import java.util.Arrays;

/**
 * Created by wyh669 on 3/14/16.
 */
public class Solution2 {

    public static void main(String[] args){
       // System.out.printf("RepeataitonLevel for %s is %s ", String.valueOf(3822), String.valueOf(solution(3822)));
       // System.out.println("-------------------");
       // System.out.printf("RepeataitonLevel for %s is %s ", String.valueOf(953), String.valueOf(solution(953)));
       // System.out.println("-------------------");
        System.out.printf("RepeataitonLevel for %s is %s ", String.valueOf(45), String.valueOf(solution(45)));
        System.out.println("-------------------");
        //System.out.printf("RepeataitonLevel for %s is %s ", String.valueOf(954), String.valueOf(solution(954)));
        //System.out.println("-------------------");
    }
    static int solution(int n) {
            int[] d = new int[32];
            int l = 0;
            int p;
            StringBuilder sb = new StringBuilder();
            while (n > 0) {
                d[l] = n % 2;
                n /= 2;
                sb.append(d[l]);
                l++;
            }

//            if(sb.reverse().equals(sb)){
//                return sb.length();
//            }
            assert(Integer.toBinaryString(n).equals(sb.toString()));

            boolean firstPass = true;
            boolean ok = true;
            int counter =0;
            int[] valid = Arrays.copyOfRange(d,0,l);
            for (p = 1; p < 1 + l; ++p) {
                for (int i =0; i < l - p+1; i++) {
                    if (d[i] == d[i + p ]) {
                        if(firstPass!=false) {
                            ok = false;
                            break;
                        }
                    } else if(firstPass==true) {
                        ok = true;
                    }
                    if(firstPass){
                        firstPass=false;
                        counter=p+1;
                        return validate(counter,valid);
                    }
                }
//                if (ok) {
//                    return counter;
//                }
            }
            return -1;
        }

    private static int validate(int counter, int[] d) {
        for(int i =0;i<d.length-1;i++){
            if(i+counter < d.length-1) {
                if (d[i] != d[i + counter]) {
                    counter = -1;
                }
            }
        }
        return counter;
    }
}
