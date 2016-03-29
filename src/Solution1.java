import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by wyh669 on 3/14/16.
 */
public class Solution1 {
    public static void main(String[] args){
        int[] input = {1,3,-3};
        int[] input1 = {-4,-3,-2,-5,-1,-1};
        int[] input2 = {8,6,10,14};
        int[] input3 = {};
        System.out.println(solution1(input));
        System.out.println(solution1(input1));
        System.out.println(solution1(input2));
    }
    public static int solution1(int[] A) {
        // write your code in Java SE 8
        List<Integer> intList = new ArrayList<Integer>(A.length);
        for (int i=0; i<A.length; i++)
        {
            intList.add(A[i]);
        }
        Collections.sort(intList);
        return Math.abs(intList.get(0)-intList.get(intList.size()-1));
    }
}
