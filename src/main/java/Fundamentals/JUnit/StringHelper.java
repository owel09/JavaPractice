package Fundamentals.JUnit;/*
 *Created by User on Aug, 2019 5:27 AM
 */

public class StringHelper {

    // AACD => CD ACD => CD CDEF => CDEF CDAA => CDAA
    public String truncateAInFirst2Postions(String str){
        if (str.length() <= 2)
            return str.replaceAll("A","");

        String first2Chars = str.substring(0,2);
        String stringMinusFirst2Chars = str.substring(2);

        return first2Chars.replaceAll("A","") + stringMinusFirst2Chars;
    }

    //ABCD => false, ABAB => true, AB => true, A => false
    public boolean areFirstAndLastTwoCharactersTheSame(String str){

        if(str.length() <= 1)
            return  false;
        if(str.length() <= 2)
            return  true;

        String first2Chars = str.substring(0,2);

        String last2Chars = str.substring(str.length() - 2);

        return first2Chars.equals(last2Chars);


    }
}
