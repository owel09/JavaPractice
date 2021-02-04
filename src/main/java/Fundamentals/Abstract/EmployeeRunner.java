package Fundamentals.Abstract;

public class EmployeeRunner {

    public static void main(String[] args) {
        Salary s = new Salary("Owel","Caloocan",28,7200.00);
        System.out.println("\nCalling mailCheck method using Salary as Reference");
        s.mailCheck();
        s.computePay();
        System.out.println("--------------------------------------------------");

        Employee e = new Salary("Jor","Laguna",30,9000.00);
        System.out.println("\nCalling mailCheck method using Employee as Reference");
        e.mailCheck();
        e.computePay(); 


    }
}
