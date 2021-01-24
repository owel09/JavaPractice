package SoloLearn.Upcast_Downcast;

import javax.crypto.Mac;

class Machine{
    public void start(){
        System.out.println("Machine started");
    }
}

class Camera extends Machine{
    public void start(){
        System.out.println("Camera started");
    }

    public void snap(){
        System.out.println("Photo taken");
    }
}

public class App {
    public static void main(String[] args) {

        Machine mymachine = new Machine();
        Camera mycamera = new Camera();

        mymachine.start();
        mycamera.start();
        mycamera.snap();

    //upcasting
        Machine machine2 = new Camera();
        machine2.start();
        //Output: Camera started

        Machine machine3 = mycamera;
        machine3.start();
        //Output: Camera started

        //error: machine2.snap();
        /*di nya makita yun snap(); kasi type Machine yung machine2.start()
        method lang meron si Machine
        kumbaga sa upcasting dapat common yung method ng Parent at Child class
         */


    }
}
