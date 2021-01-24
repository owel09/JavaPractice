package SoloLearn.EqualsHashCode;

import java.util.Objects;

public class Student {

    private String registrationNumber;

    public Student(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("From Equals");
        if (this == o) return true;
        /*
        checking if both object references are referring to the same object
         */


        if (!(o instanceof Student)) return false;

        Student student = (Student) o;
        /*
        tycasting the argument
         */
        return Objects.equals(getRegistrationNumber(), student.getRegistrationNumber());
        /*
        comparing the state of the argument
         */
    }

    @Override
    public int hashCode() {
        System.out.println("From HashCode");
        return Objects.hash(getRegistrationNumber());
    }
}
