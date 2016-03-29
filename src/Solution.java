public class Solution {

    public static void main(String[] args){
        String[] stringsList = {
                "8se3C1HvyZ",
                "jd8Dj13K4l",
                "KmRupfeml3",
                "aXIGkB2KhP",
                "ZSPeght167",
                "X9BvnDScG1",
                "KrCiYyd51A",
                "8PKQDpuART",
                "0ACgSL0klb",
                "jbZckgmEuI#",
                "null",
                "a",
                "   ",
                "1a",
                "1aA"};
        for (int i =0;i<stringsList.length;i++){
            System.out.printf("Longest valid substring of String: %s is : " , stringsList[i]);
            System.out.println(solution(stringsList[i]));
        }
    }
    public static int solution(String S) {
        // write your code in Java SE 8
        String sub = "";
        if(S==null){
            return -1;
        } else if(S.length()==1){
            return -1;
        }
        else {
            int longestValid = -1;
            for( int j = 0 ; j < S.length() ; j++ )
            {
                for( int i = 1 ; i <= S.length() - j ; i++ )
                {
                    sub = S.substring(j, j+i);
                    boolean valid = isValid(sub);
                    if(valid == true){
                        if(longestValid<sub.length()) {
                            longestValid = sub.length();
                        }
                    }
                }
            }
            return longestValid;
        }
    }

    private static boolean isValid(String subString) {
        boolean hasUppercase = !subString.equals(subString.toLowerCase());
        boolean hasLowercase = !subString.equals(subString.toUpperCase());
        if(hasLowercase && hasUppercase) {
            if (!subString.matches(".*\\d+.*")) {
                return true;
            }
        }
        return false;
    }

}
