package SoloLearn.Inheritance;

public class MethodsExample {

    MethodsExample(){
        System.out.println("Constructor method is called when object of a class is creating using new keyword");
    }

    static void staticMethod(){
        System.out.println("Static method is called without creating the object of the class");
    }

    void nonStaticMethod(){
        System.out.println("Non static method is called by creating an obejct");
    }

    public static void main(String[] args) {
        MethodsExample love = new MethodsExample();
        staticMethod();
        love.nonStaticMethod();
    }
}
