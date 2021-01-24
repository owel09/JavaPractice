package JavaBrains.unit1;

/*
 *Created by owel on 04/05/2020 7:35 AM
 */
public class Person {

    private String FirstName;
    private String LastName;
    private int age;

    public Person(String FirstName, String LastName, int age){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.age = age;
    }

    public String getFirstName() {
        return this.FirstName;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public String getLastName() {
        return this.LastName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", age=" + age +
                '}';
    }
}
