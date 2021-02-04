package Fundamentals.ReferenceVariable;

public class Square {
    public static void main(String[] args) {
        int x = 4;

//        SquareRoot(x);              // this is a statement only It doesn't change the value of x. It just notes 16.
                                      // However, when the next statement is read, System.out.println(x) yields 4 because the value of x was never altered by the previous statement.

//        x = SquareRoot(x);          // added x = so that we actually change the value of x
//        System.out.println(x);


        System.out.println(SquareRoot(x));  //the following line shows that value can be calculated without changing the value of x in the main method.
                                            //Each method uses its own variables (even if they have the same variable
    }

    static int SquareRoot(int num){ //removed the void and declared square as int
        num = num*num;
        return num;                 //added return to return the value of x after its calculated
    }
}
