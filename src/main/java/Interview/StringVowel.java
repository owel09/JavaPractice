package Interview;

/*
 *Created by Work on 13/8/2021 6:31 PM
 * Check if string contains a vowel using string matches
 *
 */
public class StringVowel {
    public static void main(String[] args) {

        String str = "hello";

        System.out.println(containsVowel(str));
    }

    public static boolean containsVowel(String str){
        return str.matches(".*[aeiouAEIOU].*");
    }

}
