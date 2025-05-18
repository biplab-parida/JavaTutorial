package DSA.String;

public class ReverseWords {
    public static void main(String[] args) {
    String s=" this   is an amazing program";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s){
        String [] ch = s.split("\\s+");
        String newString="";
        for(int i= ch.length-1; i>=0;i--){
            newString+=ch[i];
            if(i!=0){
                newString+=" ";
            }
        }
        return newString;
    }

}
