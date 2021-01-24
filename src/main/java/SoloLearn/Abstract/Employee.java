package SoloLearn.Abstract;

public abstract class Employee {

    private String name;
    private String address;
    private int number;

    //kailangan lagi may constructor ang abstract
    public Employee(String name, String address, int number) {
        System.out.println("This is a Constructor for Employee Details");
        this.name = name;
        this.address = address;
        this.number = number;
    }


    public abstract double computePay();

    public void mailCheck(){
        System.out.println("Checking the mail for: " + this.name + "," + this.address + "," + this.number);
    }

    //Getter - siguro para sa input?
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
    /*
    Bakit ko kailangan ng toString?
    Good practice kasi na ioverride yung toString method para makapagprint ng object sa sout
    at para di address lang yun ma-output natin.
     */
}
