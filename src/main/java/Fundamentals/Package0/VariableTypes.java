package Fundamentals.Package0;

public class VariableTypes {

    static int staticVariable = 1;
        //this is independent, can use inside the class and doesn't need object

    int instanceVariable = 2;
        //any method or constructor can access this variable

    void sampleMethod(){
        int localVariable = 3;
        //you can't access localVariable outside this method

        System.out.println(localVariable);
    }

    public static void main(String[] args) {
        VariableTypes obj = new VariableTypes();

        System.out.println(VariableTypes.staticVariable);
        //you can call static variable directly without obj

        System.out.println(obj.instanceVariable);
        //instance variables requires obj to call

        obj.sampleMethod();
        //calling sampleMethod to print localVariable value

    }
}
