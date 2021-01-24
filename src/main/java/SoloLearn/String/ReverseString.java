package SoloLearn.String;/*
 *Created by User on Sep, 2019 9:23 AM
 */

public class ReverseString {

    public static void main(String[] args) {
        String str = "Hello World";

        System.out.println(reverseWithStringBuilder(str));
        System.out.println(reverseManually(str));

    }

    private static String reverseWithStringBuilder(String str){
        return new StringBuilder(str)
                .reverse()
                .toString();
    }
    /*
    String Builder, string in immutable kasi o hindi mababago yung value "Owel" sa String pool kundi gumawaga ka ng
    bagong Object sa String Pool na may bagong address

     */

    public static String reverseManually(String str){
        StringBuilder sb = new StringBuilder();

        for (int i = str.length()-1; i>=0;i--){
            sb.append(str.charAt(i));

        }
        return sb.toString();
    }


}
