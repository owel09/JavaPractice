package SoloLearn.Set;

import java.util.Objects;

/*
 *Created by owel on 08/01/2020 8:14 AM
 */
public class CalliSetCustomer {

    private String name;
    private int age;

    public CalliSetCustomer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalliSetCustomer that = (CalliSetCustomer) o;
        return age == that.age &&
                name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "CalliSetCustomer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
