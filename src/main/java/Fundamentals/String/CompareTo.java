package Fundamentals.String;

public class CompareTo {

    public static void main(String[] args) {
        String str1 = "Owel";
        String str2 = "compareTo method tutorial";
        String str3 = "Owel";
        String str4 = "";
        String str5 = "OWEL";

        int var1 = str1.compareTo(str2);
        System.out.println(var1);
        /*
        Output:
        -20

        ibig sabihin di magkaparehas yung value nila.
         */

        int var2 = str1.compareTo(str3);
        System.out.println(var2);
        /*
        Output:
        0

        means magkaparehas sila
         */

        int var3 = str1.compareTo("Owel");
        System.out.println(var3);
        /*
        Output:
        0

         */

        int var4 = str1.compareTo(str4);
        System.out.println(var4);
        /*
        Output:
        4

        kapag nacocompare ka string with value vs string na empty, positive yun lumalabas na value
         */

        int var5 = str1.compareTo(str5);
        System.out.println(var5);
        /*
        Output:
        32

        Ibig sabihim case sensitive itong compareTo
         */



    }


}
