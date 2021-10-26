package Fundamentals.String;

/*
 *Created by Work on 16/10/2021 10:34 AM
 */
public class StringDemo {



    public static void main(String[] args) {
        String a = "hello/world"; // string literal, sa memory pool meron na kasing hello so irerefer lang ni b yung hello.

        String b = " hello";

        String c = "world";

        String d = "ONE";

        String ab = new String("hello"); // string with class, forcing to create new object

        System.out.println(a.charAt(2));
        System.out.println(a.indexOf('e'));
        System.out.println(a.substring(0,2));
        System.out.println(a.substring(1));
        System.out.println(a.concat("baby"));
        System.out.println(b.trim());
        System.out.println(c.toUpperCase());
        System.out.println(d.toLowerCase());



    }
}
