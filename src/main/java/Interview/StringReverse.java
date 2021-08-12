package Interview;

/*
 *Created by Work on 12/08/2021 08:29
 *How to Reverse a String in Java
 */
public class StringReverse {
    public static void main(String[] args) {

        String stringName = "rowell";


        reverse(stringName);


    }

    public static void reverse(String stringName){

        StringBuilder stringBuilder = new StringBuilder();

        //so naipasa ko na yung string
        System.out.println(stringName);

        System.out.println(stringName.length()-1);
        /*
        stringName.length()-1 = 5, kasi 5 ang total index ng "rowell" starting 0, kumbaga uubusin natin tong 5 na ito
        i >= 0 dapat may ">" kasi kapag = lang parang declaration yun eh. para maging condition siya
        i -- para maubos yung 5
         */
        for(int i = stringName.length()-1; i >=0; i--){
            stringBuilder.append(stringName.charAt(i));

        }
        System.out.println(stringBuilder.toString());

    }
}
