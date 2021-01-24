package SoloLearn.Constructor;

public class SumThis {

    SumThis(){
        System.out.println("No parameter constructor");
    }

    SumThis(int a){
        this();
        System.out.println("One parameter constructor");
    }

    SumThis(int a, int b){
        this(10);
        System.out.println("Two parameter constructor");
    }

    public static void main(String[] args) {
        SumThis obj1 = new SumThis(1,2);
        SumThis obj2 =  new SumThis(3);
        SumThis obj3 = new SumThis();

    }
}
