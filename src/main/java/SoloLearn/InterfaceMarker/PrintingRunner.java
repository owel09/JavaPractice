package SoloLearn.InterfaceMarker;

public class PrintingRunner {

    public static void main(String[] args) {

        Printing print = new Printing();

        if (print instanceof Permission){
            print.show();
        } else{
            System.out.println("No Permission");
        }

        /*
        Output:
        Printing..

        Permission is an example of marker interface kung saan empty interface lang talaga sya
        pero inimplement ko sya gamit yun Printing class to check if any class implements Permission
        Checker ko yun interface Permission para malaman ko kung sino yun mga class na gumamit ng
        "implements Permission" at para magamit yun mga method sa loob ng class.

        Para macheck yun gumamit ako ng "instanceOf" kasi nung ginawa ko yung object print. Indirectly
        parang ginagawa ko na rin yun object para sa Permission interface.

         */


    }
}
