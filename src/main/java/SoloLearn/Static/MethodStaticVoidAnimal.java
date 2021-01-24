package SoloLearn.Static;

public class MethodStaticVoidAnimal {
    static void bark(){
        System.out.println("arf,arf");
    }

    void bite(){
        System.out.println("ngat ngat grrrr");
    }

    public static void main(String[] args) {
        MethodStaticVoidAnimal dog = new MethodStaticVoidAnimal();
        bark();
//        naka static kasi yun bark method kaya pwede tayong magtawag ng ganito.
//        static means available lagi yun method
        dog.bite();
    }


}
