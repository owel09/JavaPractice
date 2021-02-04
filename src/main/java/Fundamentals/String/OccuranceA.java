package Fundamentals.String;

/*
Given S 'aaab', the function should return true.
Given S 'ba', the function should return false.
Given S 'aaa', the function should return true.
Given S 'b', the function should return true.
Given S 'abba', the function should return false.
 */

public class OccuranceA {

    public static void main(String[] args) {
        String s;
        s = "abba";

        letters(s);

        System.out.println(letters(s));
    }

    public static boolean letters(String s) {

        boolean encounteredA = false;
        for (int i = s.length()-1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == 'a') {
                encounteredA = true;
            } else if (c == 'b' && encounteredA) {
                return false;
            }
        }
        return true;

    }
}
