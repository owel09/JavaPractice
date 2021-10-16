package Basic.Methods;

/*
 *Created by Work on 14/10/2021 4:33 PM
 */
public class HelloGetData {

    int num1 = 1;

    public static void main(String[] args) {

        System.out.println(getData());

         HelloGetData helloGetData = new HelloGetData();
         helloGetData.getData2();

        System.out.println(helloGetData.num1);

        HelloGetData2 helloGetData2 = new HelloGetData2();
        helloGetData2.getdata3();
    }

    public static String getData(){
        return "hello po";
    }

    public void getData2(){
        System.out.println("elow");
    }
}
