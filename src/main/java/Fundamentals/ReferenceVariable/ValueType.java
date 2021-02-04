package Fundamentals.ReferenceVariable;

public class ValueType {
    public static void main(String[] args) {
        int x = 5;
        addOneTo(x);                //The variable x is only used to change the variable inside the method (num), but not x itself.
        System.out.println(x);
    }

    static void addOneTo(int num){  //method addOneTo creates a variable that is named num
        num = num + 1;
//        System.out.println(num);    //kung gusto mo magprint yun 6
    }
}

//In the code the method addOneTo creates a variable that is named num. Throughout the code it tells to add one to num.
//Above it is another variable(x). The variable x is only used to change the variable inside the method (num),
//but not x itself. It then tells to output x, since it wasnt changed but used to change another variable it remains as 5.
//It is showing how passing by value does not affect the variable

