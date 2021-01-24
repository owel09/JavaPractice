package JavaBrains.unit3;

/*
 *Created by owel on 13/05/2020 8:43 AM
 */
public class MethodReferenceExample {
    public static void main(String[] args) {
        Thread thread = new Thread(MethodReferenceExample::printMessage); // () -> printMessage() also means MethodReferenceExample::printMessage

        thread.start();
    }

    public static void printMessage(){
        System.out.println("Hello");
    }
}
