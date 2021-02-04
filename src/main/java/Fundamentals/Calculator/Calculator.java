package Fundamentals.Calculator;

/*
simple Calculator na nilagyan ng inheritance
 */

public class Calculator {

    public static void main(String[] args) {

        simplecalc_inhe cal = new simplecalc_inhe();    //lagi ata sa yun subclass yung ginagawan natin ng object

        switch (cal.op){
            case '+':
                cal.result = cal.calcsum();
                break;
            case '-':
                cal.result = cal.calcsub();
                break;
            case '*':
                cal.result = cal.mult();
                break;
            case '/':
                cal.result = cal.div();
                break;
                default:break;
            }

        System.out.println("The answer is: "+cal.result);

    }
    }

