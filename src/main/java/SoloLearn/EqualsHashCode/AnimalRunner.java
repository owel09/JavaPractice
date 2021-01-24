package SoloLearn.EqualsHashCode;

public class AnimalRunner {

    public static void main(String[] args) {
        Animal a = new Animal("Cat");
        Animal b = new Animal("Cat");

        System.out.println(a.equals(b));
        /*
        == is based on memory location while equals based on hashcode which is the value of the object
         */
    }
}
