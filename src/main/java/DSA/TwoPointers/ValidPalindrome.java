package DSA.TwoPointers;

public  class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        boolean flag=true;

        s=s.toLowerCase();
        int j = s.length()-1;
        int i=0;
        while(i<j)
        {
            if (!Character.isLetterOrDigit(s.charAt(i)))
                i++;
            else if(!Character.isLetterOrDigit(s.charAt(j)))
                j--;
            else
            {

                if(s.charAt(i)!=s.charAt(j))
                {
                    flag=false;
                    break;
                }
                i++;
                j--;
            }



        }

        return flag;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }
}
