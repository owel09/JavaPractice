package SoloLearn.ReferenceVariable;

public class PersonDemo {

    public static void main(String[] args) {
        Person person1 = new Person("Owel", 27);
//        Person person1 - declaration of Person Object
//        new Person("Owel", 27); - instantiation

        Person person2;

        person2 = person1;

        person1.changeDetails("Jor",30);

        System.out.println(person1);


    }
}
