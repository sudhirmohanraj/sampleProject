/**
 * Created by wyh669 on 3/14/16.
 */
public class Solution3 {

    public static void main(String[] args){
        int[] input = {1,4,-1,3,2};
        System.out.println(solution(input));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        //  1,4,-1,3,2
        // a[0]=> a[1]=>a[4]=>a[2]
        // at each stage find the next find the value in the index and see if it is -1.
        // assuming A[k] is a valid index.
        if(A.length==0){
            return -1;
        }
        int lengthOfList = 1;
        int indexTrack = 0;
        for(int i =0;i<A.length-1;i++){
            if(A[indexTrack]==-1){
                return lengthOfList;
            } else {
                indexTrack = A[indexTrack];
                lengthOfList++;
            }
        }

        return lengthOfList;
    }
}
