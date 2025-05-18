package DSA.String;

public class LargestOddNumber {
    public static void main(String[] args) {
        String s= "246";
        System.out.println(largestOddNumber(s));
    }
    public static String largestOddNumber(String s){
        String result="";
        int left=0,right=s.length()-1;
        while (left<=right){
            if(s.charAt(right)%2==0){
                right--;
            }
            else {
                if(s.charAt(left)=='0'){
                    left++;
//                    continue;
                }
                else{
                    result = s.substring(left,right+1);
                    return result;
                }
            }
        }
        return result;
    }
}
