package Fundamentals.Constructor;

public class InstanceBlock {

    {
        System.out.println("This is an Instance Block");
    }

    public InstanceBlock(){
        System.out.println("This is a constructor without parameter");
    }

    public static void main(String[] args) {
        InstanceBlock IBB = new InstanceBlock();

    }
}
