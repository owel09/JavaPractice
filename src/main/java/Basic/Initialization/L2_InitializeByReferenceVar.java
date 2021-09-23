package Basic.Initialization;

/*
 *Created by Work on 23/9/2021 10:01 AM
 */
public class L2_InitializeByReferenceVar {

    String name; //instance variable


    public static void main(String[] args) {
        L2_InitializeByReferenceVar byReferenceVar = new L2_InitializeByReferenceVar();
        byReferenceVar.name = "Owel";
        /*
        Initialize By Reference Variable kasi gumamit pa ako ng byReferenceVar object para maccess ko yung name variable
        at nilagyan ko ng value.
         */

        System.out.println(byReferenceVar.name);
    }
}
