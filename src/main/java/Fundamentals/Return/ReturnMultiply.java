package Fundamentals.Return;

public class ReturnMultiply {
    static int multiply(int owel){
        return owel*3;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = multiply(num1);

        System.out.println(num2);
    }
}
