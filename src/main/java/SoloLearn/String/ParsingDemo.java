package SoloLearn.String;

public class ParsingDemo {
    public static void main(String[] args) {

        String str1 = "10";
        System.out.println("The String str1 is: " + str1);

        int x = Integer.parseInt(str1); //gagawin nyang integer yung nasa str1 at store sa x
        System.out.println("int parsing: x*x is: " + x*x); //nagamit ko sa operation yun x variable


        String str2 = "10.5";
        System.out.println("The String str2 is: " + str2);

        double y = Double.parseDouble(str2);
        System.out.println("double parsing y*y is: " + y*y);

        String str3 = "45";
        System.out.println("The String str3 is: "+ str3);

        long z = Long.parseLong(str3);
        System.out.println("long parsing z*z is: "+ z*z);

    }
}
