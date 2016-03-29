/**
 * Created by wyh669 on 3/23/16.
 */
public class FibonacciSeriesValidation {

    public static void main(String[] args){

        Integer[] input = {1,1,2,3,5};
        Integer[] input1 = {2,3,5,8};
        Integer[] input2 = {3,5,8};
        Integer[] input3 = {5,8};
        System.out.println(isFibonacci(input));
        System.out.println(isFibonacci(input1));
        System.out.println(isFibonacci(input2));
        System.out.println(isFibonacci(input3));
    }

    static boolean isFibonacci(Integer[] input){
        if(input.length<=2){
            return false;
        }

        for(int i = 2; i < input.length-1;i++){
            if(input[i]==input[i-1]+input[i-2]){
                break;
            } else {
                return false;
            }
        }

        return true;
    }
}
