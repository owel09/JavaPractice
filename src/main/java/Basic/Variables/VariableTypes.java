package Basic.Variables;

public class VariableTypes {

    static int staticVariable = 1;
        //this is independent, can use inside the class and doesn't need object
        //bihira ko lang makita ito

    int instanceVariable = 2;
        //INSTANCE VARIABLE - variable ito na nasa loob ng class
        //any method or constructor can access this variable

    void sampleMethod(){
        int localVariable = 3;
        //LOCAL VARIABLE - variables declared inside the method
        //you can't access localVariable outside this method kaya gumamit pa ako ng
        //obj sa sa main method para matawag

        System.out.println(localVariable);
    }

    public static void main(String[] args) {
        
        System.out.println(VariableTypes.staticVariable);
        //STATIC VARIABLE can call  directly without obj

        VariableTypes obj = new VariableTypes();
        System.out.println(obj.instanceVariable);
        //INSTANCE VARIABLES requires obj to call

        obj.sampleMethod();
        //calling sampleMethod to print localVariable value

    }
}
