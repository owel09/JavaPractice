package Fundamentals.ReferenceType;

public class ReferenceTypePerson {
    private String name;
    private int age;

    public ReferenceTypePerson(String name){
        this.name = name;
    }
    /*
    constructor ito ng ReferenceTypePerson na kailangan nya maginitialize ng name
     */

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void celebrateBirthday(){
        int birth = getAge()+1;
        System.out.println("John's birthday will add 1 from "+ getAge() + " to " + birth);
    }

    public static void main(String[] args) {
        ReferenceTypePerson Pinoy = new ReferenceTypePerson("Owel");
        System.out.println(Pinoy);
        System.out.println(Pinoy.name);

        Pinoy.setAge(27);
        System.out.println(Pinoy.getAge());
    }
}
