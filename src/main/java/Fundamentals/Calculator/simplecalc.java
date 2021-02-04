package Fundamentals.Calculator;

import java.util.Scanner;

public class simplecalc {

    private int val1;
    private int val2;
    private Scanner scanner;
    public char op;
    public int result;

    public simplecalc(){
        scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        val1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the second number:");
        val2 = Integer.parseInt(scanner.nextLine());

        System.out.println("choose an operator + or -  or / or *");
        op = scanner.next().charAt(0);      //para maiwasan yun InputMismatchException

    }

    public char set_op(){   //feeling ko di na need ito
        op = (char) scanner.nextShort();
        return op;
    }

    public int calcsum() {
        return this.val1 + this.val2;
    }

    public int calcsub(){
        return this.val1 - this.val2;
    }

    public int getX(){
        return this.val1;
    }

    public int getY(){
        return this.val2;
    }

}
