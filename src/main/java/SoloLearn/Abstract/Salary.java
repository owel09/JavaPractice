package SoloLearn.Abstract;

public class Salary extends Employee{
    private double salary;

    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }



    //test git
    public void mailCheck() {
        System.out.println("This is mailCheck in Salary Class");
        System.out.println("Mailing check to " + getName() + " , " + getSalary());
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double NewSalary) {
        if (NewSalary >= 0.0){

            salary = NewSalary;
        }
    }

    public double computePay() {
        System.out.println("This is computePay in Salary Class:" + getName());
        return salary/52;
    }

}
