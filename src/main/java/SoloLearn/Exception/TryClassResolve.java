package SoloLearn.Exception;/*
 *Created by User on Sep, 2019 11:56 AM
 */

public class TryClassResolve {
    public static void main(String[] args) {

        int x = 50;
        int y = 0;

        try {
            int result = x/y;
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println(x/(y+2));
            /*
            resolving arithmetic exception in catch block.
            tinanggal ko yung printStackTrace para di magprint yun exception
             */

        }

    }
}
