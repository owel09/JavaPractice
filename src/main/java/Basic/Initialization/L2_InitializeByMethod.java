package Basic.Initialization;

/*
 *Created by Work on 23/9/2021 10:01 AM
 */
public class L2_InitializeByMethod {

    String name;

    public void nameMethod(String s){
        name=s;
        System.out.println(name);
    }

    public static void main(String[] args) {
        L2_InitializeByMethod initializeByMethod = new L2_InitializeByMethod();
        initializeByMethod.nameMethod("Owel");
        /*
        Intialize By Method - tinawag ko yung nameMethod at dun ko pinasa yung value na Owel
        Sinalo naman naman ni nameMethod at pumasok sa (String s)
        name=s ito yung assignment para maprint.
         */

    }
}
