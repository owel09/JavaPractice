package JavaBrains.unit2;

/*
 *Created by owel on 12/05/2020 8:14 AM
 */
public class ClosureExample {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        doProcess(a, i -> System.out.println(i + b));

    }

    public static void doProcess (int i, Process p){
        p.process(i);
    }
}

interface Process {

    void process(int i); //method process takes int
}
