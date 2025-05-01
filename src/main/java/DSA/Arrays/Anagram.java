package DSA.Arrays;

import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String s, String t) {
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        if (s.length() != t.length())
            return false;
        Arrays.sort(sc);
        Arrays.sort(tc);
        for (int i = 0; i < s.length(); i++) {
            if (sc[i] != tc[i])
                return false;
        }
        return true;
    }

    public static boolean isAnagram2(String s, String t) {
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(tc);
        return Arrays.equals(sc, tc);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram2("anagram", "nagaram"));
        System.out.println(isAnagram2("rat", "car"));
    }
}
